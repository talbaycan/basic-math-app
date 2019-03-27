#Basic Math App
Amacımız ekrandan input alıp bunları çalıştırıp ekrana geri yazan çalıştırılabilir bir jar oluşturup consoledan calıstırmak.

* **Proje Adı:** basic-math-app
* **Package Adı:** com.albaycan.basicmathapp
* **Yapısı:** Uygulama içinde 2 adet class olsun

### 1. AppManager.java: 
* Ekrana aşagıdaki gibi bir yazı yazacak. Başında > olan satırlar örnek olarak kullanıcıdan gelen inputları gösteriyor.

```
===============================
***********Welcome*************
===============================
Please enter first number:
>10

Please enter second number:
>5

What would you like to do now?
(1) Sum
(2) Subtract
(3) Multiply
(4) Divide
Press Ctrl + C to exit.

>1
Sum of your numbers are : ‘15’
Press A to go back to menu or Ctrl + C to exit.
```

* Kullanıcı ESC’e basana kadar hesaplara devam edebilecek.

### 2. BasicMath.java: 
* Constructor'ında 2 tane integer deger alsın, x ve y. 
* 4 adet methodu olsun add(), subtract(), multiply(), divide().

	add() --> x+y hesaplasın
	subtract() --> x-y hesaplasın
	multiply() --> x*y hesaplasın
	divide() --> x/y hesaplasın. sonucu 0.00 seklinde float olarak döndürebilsin.

### Implementation
1. GitHub'da yeni bir repository oluşturup, kodları oraya push edelim. Repo adı proje adının aynısı olsun.
	

### Dikkat edilecek hususlar
* Proje klasör yapısı şu şekilde olsun

	/basic-math-app
	|..../src	--> tüm class'lar bu klasör içinde olsun.
	|…..* 		--> diger tüm dosyalar ana kasör içinde yer alsın. (manifesto, readme, gitignore vs. )
	
* Proje klasörünün içine README.md dosyası oluşturup, içine tüm bu yazdıklarımı baştan sona kopyalayıp yapıştırıp, formatlayalım.


