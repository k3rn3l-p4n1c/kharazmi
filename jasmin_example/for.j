;
;for (int i=5; i<10; i++)
;   print "Hello World!"
;

.class public HelloWorld
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 1

    ; i=5
    bipush 5 ; loads number 5
    ; iconst_5 ; loads constant number 5
    istore 0

    Label_Start_Loop:

      ; condition i<10
      iload 0
      bipush 10
      if_icmpge Label_Exit_Loop

      ; print "Hello World!"
      getstatic java/lang/System/out Ljava/io/PrintStream;
      ldc "Hello World!"
      invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

      ; i++
      iinc 0 1
      goto Label_Start_Loop
    Label_Exit_Loop:

    return
.end method
