����   ; N
      java/lang/Object <init> ()V	  	 
   principioRU/EntradaDatos a I	     b  java/util/Scanner	      java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     Ljava/util/Scanner;	     ! out Ljava/io/PrintStream; # Ingrese un valor para a: 
 % & ' ( ) java/io/PrintStream print (Ljava/lang/String;)V
  + , - nextInt ()I / Ingrese un valor para b:  1 principioRU/Sumar
 0 3  4 (II)V	  6 7 8 
sumarDatos LprincipioRU/Sumar;
 0 : ;  operacionSumar = principioRU/Restar
 < 3	  @ A B restarDatos LprincipioRU/Restar;
 < D E  operacionRestar Code LineNumberTable LocalVariableTable this LprincipioRU/EntradaDatos; entradaDatos 
SourceFile EntradaDatos.java !        7 8     A B                        F   =     *� *� *� �    G   
       H        I J    K   F   �     i*� Y� � � � "� $**� � *� � .� $**� � *� *� 0Y*� *� � 2� 5*� 5� 9*� <Y*� *� � >� ?*� ?� C�    G   * 
        !  )  4  G  N  a  h  H       i I J    L    M