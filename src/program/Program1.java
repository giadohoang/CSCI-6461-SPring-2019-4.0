package program;

import java.util.HashMap;

public class Program1 {
	HashMap<Integer, String> program1;
	/*
	 * For description, please see at the bottom or design file
	 */
	public Program1() {
		this.program1 = new HashMap<>();
		
		this.program1.put(300,"1111010000000000");//1
		this.program1.put(301,"0000100000001100");
		
		this.program1.put(302,"1111010000000000");//2
		this.program1.put(303,"0000100000001101");
		
		this.program1.put(304,"1111010000000000");//3
		this.program1.put(305,"0000100000001110");
		
		this.program1.put(306,"1111010000000000");//4
		this.program1.put(307,"0000100000001111");
		
		this.program1.put(308,"1111010000000000");//5
		this.program1.put(309,"0000100000010000");
		
		
		this.program1.put(310,"1111010000000000");//6
		this.program1.put(311,"0000100000010001");
		this.program1.put(312,"1111010000000000");//7
		this.program1.put(313,"0000100000010010");
		this.program1.put(314,"1111010000000000");//8
		this.program1.put(315,"0000100000010011");
		this.program1.put(316,"1111010000000000");//9
		this.program1.put(317,"0000100000010100");
		this.program1.put(318,"1111010000000000");//10
		this.program1.put(319,"0000100000010101");
		this.program1.put(320,"1111010000000000");//11
		this.program1.put(321,"0000100000010110");
		this.program1.put(322,"1111010000000000");//12
		this.program1.put(323,"0000100000010111");
		this.program1.put(324,"1111010000000000");//13
		this.program1.put(325,"0000100000011000");
		this.program1.put(326,"1111010000000000");//14
		this.program1.put(327,"0000100000011001");
		this.program1.put(328,"1111010000000000");//15
		this.program1.put(329,"0000100000011010");
		this.program1.put(330,"1111010000000000");//16
		this.program1.put(331,"0000100000011011");
		this.program1.put(332,"1111010000000000");//17
		this.program1.put(333,"0000100000011100");
		this.program1.put(334,"1111010000000000");//18
		this.program1.put(335,"0000100000011101");
		this.program1.put(336,"1111010000000000");//19
		this.program1.put(337,"0000100000011110");
		this.program1.put(338,"1111010000000000");//20
		this.program1.put(339,"0000100000011111");
		
		this.program1.put(340,"1111010000000000");//21
		this.program1.put(341,"0000100000001011");//Store at memory location 11
		
		this.program1.put(342,"0000010000001100");//22
		this.program1.put(343,"0001010000001011");//23
		this.program1.put(344,"0110100101000000");//24
		this.program1.put(345,"0000100100001011");//24.a
		this.program1.put(345,"0000100000001010");//25
		this.program1.put(346,"0000010000001101");//1a
		this.program1.put(347,"0000010000001011");//b
		this.program1.put(348,"0001010000001011");//c
		this.program1.put(349,"0110100101000000");//d
		this.program1.put(350,"0110110110001011");//e
		this.program1.put(351,"0000100000001010");//f
		
		this.program1.put(352,"0000010000001110");//2a
		this.program1.put(353,"0000010000001011");//b
		this.program1.put(354,"0001010000001011");//c
		this.program1.put(355,"0110100101000000");//d
		this.program1.put(356,"0110110110001011");//e
		this.program1.put(357,"0000100000001010");//f
		
		this.program1.put(358,"0000010000001111");//3a
		this.program1.put(359,"0000010000001011");//b
		this.program1.put(360,"0001010000001011");//c
		this.program1.put(361,"0110100101000000");//d
		this.program1.put(362,"0110110110001011");//e
		this.program1.put(363,"0000100000001010");//f
		
		this.program1.put(364,"0000010000010000");//4a
		this.program1.put(365,"0000010000001011");//b
		this.program1.put(366,"0001010000001011");//c
		this.program1.put(367,"0110100101000000");//d
		this.program1.put(368,"0110110110001011");//e
		this.program1.put(369,"0000100000001010");//f
		
		this.program1.put(370,"0000010000010001");//5a
		this.program1.put(371,"0000010000001011");//b
		this.program1.put(372,"0001010000001011");//c
		this.program1.put(373,"0110100101000000");//d
		this.program1.put(374,"0110110110001011");//e
		this.program1.put(375,"0000100000001010");//f
		//so far
		
		
		this.program1.put(376,"0000010000010010");//6a
		this.program1.put(377,"0000010000001011");//b
		this.program1.put(378,"0001010000001011");//c
		this.program1.put(379,"0110100101000000");//d
		this.program1.put(380,"0110110110001011");//e
		this.program1.put(381,"0000100000001010");//f
		
		this.program1.put(382,"0000010000010011");//7a
		this.program1.put(383,"0000010000001011");//b
		this.program1.put(384,"0001010000001011");//c
		this.program1.put(385,"0110100101000000");//d
		this.program1.put(386,"0110110110001011");//e
		this.program1.put(387,"0000100000001010");//f
	
		//So far: a,b,c,d,f
		this.program1.put(388,"0000010000010100");//8a
		this.program1.put(389,"0000010000001011");//b
		this.program1.put(390,"0001010000001011");//c
		this.program1.put(391,"0110100101000000");//d
		this.program1.put(392,"0110110110001011");//e
		this.program1.put(393,"0000100000001010");//f
		
		this.program1.put(394,"0000010000010101");//9a
		this.program1.put(395,"0000010000001011");//b
		this.program1.put(396,"0001010000001011");//c
		this.program1.put(397,"0110100101000000");//d
		this.program1.put(398,"0110110110001011");//e
		this.program1.put(399,"0000100000001010");//f
		
		this.program1.put(400,"0000010000010110");//10a
		this.program1.put(401,"0000010000001011");//b
		this.program1.put(402,"0001010000001011");//c
		this.program1.put(403,"0110100101000000");//d
		this.program1.put(404,"0110110110001011");//e
		this.program1.put(405,"0000100000001010");//f
		
		this.program1.put(406,"0000010000010111");//11a
		this.program1.put(407,"0000010000001011");//b
		this.program1.put(408,"0001010000001011");//c
		this.program1.put(409,"0110100101000000");//d
		this.program1.put(410,"0110110110001011");//e
		this.program1.put(411,"0000100000001010");//f
		
		this.program1.put(412,"0000010000011000");//12a
		this.program1.put(413,"0000010000001011");//b
		this.program1.put(414,"0001010000001011");//c
		this.program1.put(415,"0110100101000000");//d
		this.program1.put(416,"0110110110001011");//e
		this.program1.put(417,"0000100000001010");//f
		
		this.program1.put(418,"0000010000011001");//13a
		this.program1.put(419,"0000010000001011");//b
		this.program1.put(420,"0001010000001011");//c
		this.program1.put(421,"0110100101000000");//d
		this.program1.put(422,"0110110110001011");//e
		this.program1.put(423,"0000100000001010");//f
		
		this.program1.put(424,"0000010000011010");//14a
		this.program1.put(425,"0000010000001011");//b
		this.program1.put(426,"0001010000001011");//c
		this.program1.put(427,"0110100101000000");//d
		this.program1.put(428,"0110110110001011");//e
		this.program1.put(429,"0000100000001010");//f
		
		this.program1.put(430,"0000010000011011");//15a
		this.program1.put(431,"0000010000001011");//b
		this.program1.put(432,"0001010000001011");//c
		this.program1.put(433,"0110100101000000");//d
		this.program1.put(434,"0110110110001011");//e
		this.program1.put(435,"0000100000001010");//f
		
		this.program1.put(436,"0000010000011100");//16a
		this.program1.put(437,"0000010000001011");//b
		this.program1.put(438,"0001010000001011");//c
		this.program1.put(439,"0110100101000000");//d
		this.program1.put(440,"0110110110001011");//e
		this.program1.put(441,"0000100000001010");//f
		
		this.program1.put(442,"0000010000011101");//17a
		this.program1.put(443,"0000010000001011");//b
		this.program1.put(444,"0001010000001011");//c
		this.program1.put(445,"0110100101000000");//d
		this.program1.put(446,"0110110110001011");//e
		this.program1.put(447,"0000100000001010");//f
		
		this.program1.put(448,"0000010000011110");//18a
		this.program1.put(449,"0000010000001011");//b
		this.program1.put(450,"0001010000001011");//c
		this.program1.put(451,"0110100101000000");//d
		this.program1.put(452,"0110110110001011");//e
		this.program1.put(453,"0000100000001010");//f
		
		this.program1.put(454,"0000010000011111");//19a
		this.program1.put(455,"0000010000001011");//b
		this.program1.put(456,"0001010000001011");//c
		this.program1.put(457,"0110100101000000");//d
		this.program1.put(458,"0110110110001011");//e
		this.program1.put(459,"0000100000001010");//f
	
		//at this point memory location 10 stores the closet number
		//memory location 9 stores the difference between user input number and number on memory location 10 
/*
 * 1.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 12: 0000100000001100

2.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 13: 0000100000001101

3.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 14: 00001000000 01110

4.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 15: 00001000000 01111

5.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 16: 00001000000 10000

6.Take value from console keyboard to register R0:111101 00 000 00000
Store R0 to memory location 17: 00001000000 10001

7.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 18: 00001000000 10010

8.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 19: 00001000000 10011

9.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 20: 00001000000 10100

10.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 21: 00001000000 10101

11.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 22: 00001000000 10110

12.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 23: 00001000000 10111

13.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 24: 00001000000 11000

14.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 25: 00001000000 11001

15.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 26: 00001000000 11010

16.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 27: 00001000000 11011

17.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 28: 00001000000 11100

18.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 29: 00001000000 11101

19.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 30: 00001000000 11110

20.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 31: 00001000000 11111

21.Take value from console keyboard to register R0: 111101 00 000 00000
Store R0 to memory location 11: 00001000000 01011

//Start comparing
//1st, assume min is at location 12

22.Load from memory at location 12 to R0: 0000010000001100

23.Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
24. ABS instruction: 26, make R1 positive store back into R1
011010 01 01 00000
24.a store R1 into memory location 9
000010 01 00 0 01011
25.store what ever on R0 to mem loc 10: 0000100000001010

1st Iteration  
a. Load from memory at location 13 to R0: 0000010000001101

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010

2nd  Iteration
a. Load from memory at location 14 to R0: 0000010000001110

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010

3rd  Iteration

a. Load from memory at location 15 to R0: 0000010000001111

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010

4th  Iteration


a. Load from memory at location 16 to R0: 0000010000010000

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
5th  Iteration


a. Load from memory at location 17 to R0: 0000010000010001

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
6th  Iteration


a. Load from memory at location 18 to R0: 0000010000010010

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
7th  Iteration


a. Load from memory at location 19 to R0: 0000010000010011

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
8th  Iteration


a. Load from memory at location 20 to R0: 0000010000010100

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
9th  Iteration


a. Load from memory at location 21 to R0: 0000010000010101

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
10th  Iteration


a. Load from memory at location 22 to R0: 0000010000010110

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
11th  Iteration


a. Load from memory at location 23 to R0: 0000010000010111

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
12th  Iteration

a. Load from memory at location 24 to R0: 0000010000011000

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
13th  Iteration

a. Load from memory at location 25 to R0: 0000010000011001

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
14th  Iteration

a. Load from memory at location 26 to R0: 0000010000011010

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
15th  Iteration

a. Load from memory at location 27 to R0: 0000010000011011

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
16th  Iteration

a. Load from memory at location 28 to R0: 0000010000011100

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
17th  Iteration

a. Load from memory at location 29 to R0: 0000010000011101

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
18th  Iteration

a. Load from memory at location 30 to R0: 0000010000011110

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010
19th  Iteration

a. Load from memory at location 31 to R0: 0000010000011111

b. Load from memory at location 9 to R2: 0000010000001011 (stick)

c. Take different between R0 and content at memory location 11, store into R1
000101 	00 	00 	0 	01011
d. ABS instruction: 26, make R1 positive store into R1
011010 01 01 00000
e. If R1 < Content at memory locaion 9, Store R1 to Content at memory locaion 9 and pc +1,
else PC + 2:
OP		R1	R2  EA	  
011011	01	10	01011

f. store what ever on R0 to mem loc 10: 0000100000001010

Print out to Screen value at location 10
111110 00 000 00001 
 */
	}

	

}