; 0000000000
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Hello World!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V


; 1111111111
ldc 25

ldc 5
ldc 6
imul

isub

ldc 15
iadd


; 2222222222
ldc 5
istore_1
ldc 6
istore_2

ldc 25

iload 1
iload 2
imul

isub

ldc 15
iadd

istore_1


; 3333333333
ldc 12
ldc 2
irem

ldc 0
if_icmpeq then1
ldc 0
goto end1
then1:
    ldc 1
end1:

istore 1

getstatic java/lang/System/out Ljava/io/PrintStream;

iload 1
ifne then2
ldc "Value is odd!"
goto end2
then2:
    ldc "Value is even!"
end2:

invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V


; 4444444444
ldc 12
istore 0
ldc 4
istore 1

iload 0
ldc 10
if_icmpgt then

iload 1
ldc 5
if_icmplt else
ldc "Neither"
goto end

else:
    ldc "Input2 is small!"
    goto end

then:
    ldc "Input1 is large!"

end:
    astore 2

getstatic java/lang/System/out Ljava/io/PrintStream;
aload 2
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V


; 5555555555
ldc 0
istore 0
ldc 0
istore 1

while:
    iload 1
    ldc 10
    if_icmpge end

    iload 0
    iload 1
    iadd
    istore 0

    iinc 1 1

    goto while
end:


; 6666666666
ldc 10
istore 0

iload 0
i2d
ldc2_w 5.0d
dadd

iload 0
i2d
dmul

ldc2_w 2.0d
dsub

ldc2_w 3.0d
ddiv

dstore 0


; 7777777777
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Enter your name: "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokenonvirtual java/util/Scanner/<init>(Ljava/io/InputStream;)V

invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;
astore 1

getstatic java/lang/System/out Ljava/io/PrintStream;
dup

ldc "Hello, "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
aload 1
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V


; 8888888888
.field private valueOne I
.field private valueTwo I

.method public static main([Ljava/lang/String;)V
	.limit stack 2
	.limit locals 2

	new Exercise8
	dup
	invokenonvirtual Exercise8/<init>()V
	astore 1

    aload 1
    ldc 42
    invokevirtual Exercise8/setValueOne(I)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 1
    invokevirtual Exercise8/getSumOfValues()I
    invokevirtual java/io/PrintStream/println(I)V

	return
.end method

.method public <init>()V
	.limit stack 2

	aload_0
	dup
	invokenonvirtual java/lang/Object/<init>()V

	ldc 99
    putfield Exercise8/valueTwo I

	return
.end method

.method public setValueOne(I)V
	.limit stack 2
	.limit locals 2

	aload 0
	iload 1
	putfield Exercise8/valueOne I

	return
.end method

.method public getSumOfValues()I
	.limit stack 2
	.limit locals 1

	aload 0
	getfield Exercise8/valueOne I
	aload 0
	getfield Exercise8/valueTwo I

    iadd

	ireturn
.end method