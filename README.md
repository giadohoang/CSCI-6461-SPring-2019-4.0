# CSCI-6461-SPring-2019-4.0
CSCI 6461 SPRING 2019 SIMULATOR version 4.0Design note
Team member:
Paola figuera
Kun duan
Gia do
About
We built this simulator to have a detailed understanding of the internal design of a computer system. This project will give us an opportunity to have a deeper understanding of the design, structure and operations of a computer system, which principally focuses on the ISA and how it is executed. On the first deliverable, we focus on  design and implement the basic machine architecture. This machine will be equipped with a simple memory and designed to execute Load and Store instructions. Additionally, the first delivery will also comes with initial user interface that provides a detailed looks into basic registers inside a computer.

About (cont.)
Second delivery comes with: 
Updated User Interface
Implementation of all instructions from the design note
Cache implementation
Program I that use machine instruction to find closest number from 20 numbers entered

Language
IDE: Eclipse
We use Java for back and front end design
Jre 1.8 library is used

Delivery i
We implement basic structure of a computer system including
Registers: pc, cc, ir, mar, mbr, mfr, x1, x2, x3, x4, r0, r1, r2, r3.
Memory of size 2048
Load and Store instructions
Console with instruction input and output display.

Delivery ii
Following instructions are available
Load/Store instructions 
LDR: Load Register From Memory
STR: Store Register To Memory
LDA: Load Register with Address
LDX: Load Index Register from Memory
STX: Store Index Register to Memory

Delivery ii
Following instructions are available
Transfer Instructions:
JZ: Jump If Zero
JNE: Jump If Not Equal
JCC: Jump If Condition Code
JMA: Unconditional Jump To Address

Delivery ii
Following instructions are available
Transfer Instructions(cont.):
JSR: Jump and Save Return Address
RFS: Return From Subroutine
SOB: Subtract One and Branch
JGE: Jump Greater Than or Equal To

Delivery ii
Following instructions are available
Arithmetic and Logical Instructions
AMR : Add Memory To Register
SMR: Subtract Memory From Register
AIR: Add  Immediate to Register
SIR: Subtract  Immediate  from Registe

Delivery ii
Following instructions are available
Arithmetic and Logical Instructions(cont.)
MLT : Multiply Register by Register
DVD: Divide Register by Register
TRR: Test the Equality of Register and Register
AND: Logical And of Register and Register
ORR: Logical Or of Register and Register
NOT: Logical Not of Register To Register

Delivery ii
Following instructions are available
Shift/Rotate Operations
SRC : Shift Register by Count
RRC: Rotate Register by Count

Delivery ii
Following instructions are available
I/O Operations
IN: Input Character To Register from Device
OUT: Output Character to Device from Register
CHK: Check Device Status to Register

Delivery ii
CACHE
16 cache lines are included in this simulator
Cache is a fully associative, unified cache, in another word, data and instructions can be load/ store into any location on cache.
Every load/ stores steps are performed through cache before going to memory

Delivery ii
Program I
Well documented and user friendly instruction can be seen through front panel design.
Learning curve for new user using this new interface will be fast as all steps and instructions are well noted.

Delivery III
Vector implementation
Several addresses in memory will point to another block of  addresses on the same memory.
It is useful when implement program 2 when conditional jump is required.
Example: comparing content of two registers R0 and R1, if equals, jump to memory location x where its content will point to a block of address to update information needed. If not, increment pointer and go on
Please refer to program 2 design plan.dpf for detailed explaination.

Delivery III: program 2
Finding a word in a paragraph, if found print the message includes its location on the pa
Well documented and user friendly instruction can be seen through front panel design.
Learning curve for new user using this new interface will be fast as all steps and instructions are well noted.

Delivery iV: Floating point registers and instructions
Following instructions are available
Transfer Instructions:
FADD: Floating Add Memory To Register
FSUB: Floating Subtract Memory From Register
VADD: Vector Add
VSUB: Vector Subtract
CNVRT: Convert to Fixed/ Floating Point
LDRF: Load Floating Register From Memory
STFR: Store Floating Register To Memory
Delivery iV: Floating Point Program
We demonstrated Floating Point Add, Subtract, Vector Add, and Floating Point Conversion on this delivey.
Each program can be activated through separate buttons as follow:
Button 1: Floating Add and Subtract program
Button 2: Vector Add program
Button 3: Floating Point Conversion program
Thank you!
