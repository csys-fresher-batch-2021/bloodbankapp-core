# Project Features
## Project title:  Blood bank app

### Blood Type table

```sql
create table bloodType
(
blood_id varchar2(7),
blood_type varchar2(7) primary key
);
```
### Insert data of bloodtype
```sql
insert into bloodtype values('BL01','O+');
insert into bloodtype values('BL02','O-');
insert into bloodtype values('BL03','A+');
insert into bloodtype values('BL04','A-');
insert into bloodtype values('BL05','B+');
insert into bloodtype values('BL06','AB-');
insert into bloodtype values('BL07','AB+');
insert into bloodtype values('BL08','B-');
```
### List all bloodtype

```sql
select blood_type from bloodtype;
```

### Donor information table
```sql
create table donor
(
donor_id varchar2(10) primary key,
donor_name varchar2(20),
blood_type varchar2(7),
donor_address varchar2(50),
donor_email varchar2(30),
donor_phone_no number,
active number not null,
last_donated_on date,
constraint cons_fk10 foreign key(blood_type) references bloodtype(blood_type)
);
```
### INSERT DATA OF DONOR

```sql
insert into donor values('DOO3','Asyraff','A+','No 1:MK COMPLEX kanchipuram','asraf08@gmail.com',9899766556,1,'20-05-2020');
insert into donor values('DOO4','Aina','AB-','No 49:Pallavan nagar chennai','aina@gmail.com',7899766556,1,'13-09-2020');
insert into donor values('DOO5','Amira','O-','No 9:Tnagar chennai','mira124@gmail.com',9659766006,1,'21-03-2019');
insert into donor values('DOO2','Aiman','O+','No 13:Vedhachalam nagar coimbatore','aiman11@gmail.com',6888766536,1,'05-02-2021');
insert into donor values('DOO1','Sarah','O-','No 4:Ponniamman nagar trichy','sarah@gmail.com',9150078986,1,'05-05-2020');
insert into donor values('DOO6','Daniel','B-','No 5:Greens garden nagercoil','nial@gmail.com',9004766556,1,'09-01-2021');
```
### To check the donor can donate or not using procedure
```sql
create or replace procedure tocheckdonarcandonate_hem_h
as
cursor c1 is select last_donated_on from donor;
begin
for i in c1 loop
if i.last_donated_on between sysdate-93 and sysdate then
dbms_output.put_line('you cannot donate');
else
dbms_output.put_line('you can donate');
end if;
end loop;
end;
```

### SELECTION AND PROJECTION:

#### .Display the name and mobile number of donor with blood_type is 'O+'.
```sql
SELECT donor_name,donor_phone_no from donor where blood_type = 'O+';
```
### PATIENT INFORMATION TABLE
```sql
create table patient 
(
patient_id varchar2(10) primary key,
patient_name varchar2(20),
blood_type varchar2(7),
patient_address varchar2(50),
patient_email varchar2(30),
patient_phone_no number
);
```
### INSERT DATA OF PATIENT
```sql
insert into patient values('POO6','Aniq','O-','No 2:subash chandra bose street villupuram','aniq7@yahoo.com',9894528445);
insert into patient values('POO4','Liyana','O+','No 62:madam street chennai','lieyana@gmail.com',9894504844);
insert into patient values('POO3','Yusri','O-','No 98:Adyar chennai','yuss04@gmail.com',9922089333);
insert into patient values('POO5','Nabil','B-','No 21:Kaveripakkam','nabil@yahoo.com',8822098761);
insert into patient values('POO1','Intan','A+','No 5 Tirunelveli','intann@gmail.com',9894044921);
insert into patient values('POO2','Nadhirah','AB-','No 58 tuticorin','nanad11@gmail.com',6654321880);
```
### SELECTION AND PROJECTION:

#### .Display the information of all patients who has a type of blood O-.
```sql
SELECT * from patient where blood_type='O-';
``` 
### BLOOD DONATION INFORMATION TABLE
```sql
create table blood
(
blood_id varchar2(10) primary key,
donor_id varchar2(10),
event_id varchar2(10),
blood_quantity number,
constraint cons_fk1 foreign key(donor_id) references donor(donor_id),
constraint cons_fk2 foreign key(event_id) references blooddonevent(event_id)
);
```
### INSERT DATA OF BLOOD DONATED BY THE CORRESPONDING DONOR
```sql
insert into blood values('BL01','DOO5','E002',1);
insert into blood values('BL02','DOO2','E001',2);
insert into blood values('BL03','DOO3','E006',1);
insert into blood values('BL04','DOO4','E004',1);
insert into blood values('BL05','DOO6','E005',1);
insert into blood values('BL06','DOO1','E003',2);
```
### BLOOD DONATE EVENT INFORMATION TABLE

```sql
create table blooddonevent
(
event_id varchar2(10) primary key,
branch_no varchar2(10),
event_date date,
constraint cons_fk3 foreign key(branch_no) references branch(branch_no)
);
```
### INSERT DATA OF BLOOD DONATE EVENT
```sql
insert into blooddonevent values('E003','B004','24-MAY-2019');
insert into blooddonevent values('E005','B005','19-AUG-2019');
insert into blooddonevent values('E001','B005','08-DEC-2019');
insert into blooddonevent values('E002','B006','22-MAR-2019');
insert into blooddonevent values('E004','B002','09-MAR-2019');
insert into blooddonevent values('E006','B001','06-JUL-2019');
```
### SELECTION AND PROJECTION:

#### .Find the donor who contributed to the blood donation event numbered E005.
```sql
SELECT donor_id from blood where event_id='E005';
```
 
### BRANCH INFORMATION TABLE

```sql
create table branch
(
branch_no varchar2(10) primary key,
street varchar2(20),
city varchar2(20),
postcode number
);
```
### INSERT DATA OF BRANCH
```sql
insert into branch values('B002','Pallavan street','Kanchipuram',631501);
insert into branch values('B003','mettu street','Kanchipuram',631501);
insert into branch values('B001','royapet','chennai',600014);
insert into branch values('B004','Ponniamman street','chennai',600002);
insert into branch values('B005','kandhi street','trichy',620001);
insert into branch values('B006','Adhavan street','tuticorin',628001);
```
### SELECTION AND PROJECTION:

#### .Display street,city and postcode which is located in branch B004.
```sql
SELECT street,city,postcode from branch where branch_no='B004';
```

### BLOOD RECEIVED PATIENT INFORMATION TABLE

```sql
create table bloodpatient
(
patient_id varchar2(10),
blood_id varchar2(10),
blood_date date,
quantity number,
constraint cons_fk4 foreign key(patient_id) references patient(patient_id),
constraint cons_fk5 foreign key(blood_id) references blood(blood_id)
);
```
### INSERT DATA OF BLOOD PATIENT
```sql
insert into bloodpatient values('POO3','BL02','15-AUG-2019',1);
insert into bloodpatient values('POO1','BL06','24-MAR-2019',1);
insert into bloodpatient values('POO2','BL04','27-MAY-2019',1);
insert into bloodpatient values('POO4','BL01','13-JAN-2019',2);
insert into bloodpatient values('POO6','BL03','23-AUG-2019',1);
insert into bloodpatient values('POO5','BL05','24-JUL-2019',1);
```
### AGGREGATION AND GROUPING:

#### .Display the blood id of the patient taht received more than 1 quantity of blood.
```sql
SELECT count(blood_id) from bloodpatient where quantity>1;
```

#### .Display number of patients received blood in august and the sum of quantity.
```sql
SELECT count(patient_id),sum(quantity) from bloodpatient where blood_date like '%8%';
```

#### .Display the number of patients in each bloodtype.
```sql
SELECT blood_type,count(patient_id) from patient group by blood_type;
```
#### .Display donors name,address and phone number that have 'O-' blood type in order.
```sql
SELECT blood_type,donor_name,donor_address,donor_phone_no from donor where blood_type='O-' order by donor_name;
```

#### .Display list of branch number,event id and dates from earliest to recent date.
```sql
SELECT branch_no,event_id,event_date from blooddonevent order by event_date;
```

#### .Display donor id,blood type and quantity of blood donated.
```sql
SELECT b.donor_id,d.blood_type,b.blood_quantity
FROM blood b,donor d
where b.donor_id=d.donor_id;
```
<<<<<<< HEAD
DONOR_ID   BLOOD_TYPE   BLOOD_QUANTITY
--------------------------------------
DOO3	     A+          	 1
DOO4	     AB-	         1
DOO5	     O-	             1
DOO2	     O+         	 2
DOO1	     O-            	 2
DOO6	     B-          	 1
=======
>>>>>>> 763d10ae41c2f653f1830bc2101ca29caace6ec6

