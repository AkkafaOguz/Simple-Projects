package ucusUcretHesaplama;

import java.util.Scanner;

public class UcusUcret {

	public static void main(String[] args) {
	
		/*
         * A þehrinden uçamak isteyen bir kiþi B þehrine 500km C þehrine 700km D þehrine
         * 900 km mesafededir. km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat
         * %50 indirim 12 ve 24 yas arasindaysa 10% indirim 65 yasindan buyukse 30%
         * indirim gidis donus bilet alirsa yaþ indirimlerinden hariç 20% indirim bu
         * kosullara gore yolcudan gideceði mesafeyi isteyip ucak bilet ucretini
         * hesaplayan program yazýnýz
         */
		
		
		
		
		
	Scanner scan= new Scanner(System.in);
	System.out.println("'B' þehrine bilet almak için 1'i, \n'C' þehrine bilet almak için 2'yi, \n'D' þehrine bilet almak için 3'ü seçiniz: ");
	int sehir= scan.nextInt();
	  
	System.out.println("Biletinizi gidiþ-dönüþ alacaksanýz '1', tek yön alacaksýnýz '0' yazýnýz:");
	int gd= scan.nextInt();
	
	System.out.println("Lütfen yaþýnýzý giriniz: ");
	int yas= scan.nextInt();
	
	double bSehriStandartFýyat= 500*0.10;
	double cSehriStandartFýyat= 700*0.10;
	double dSehriStandartFýyat= 900*0.10;
	
	
	
	if (yas > 0) {

		if (yas < 12) { // %50 indirim

			if (sehir == 1) {

				if (gd == 1) { // + %10 indirim
					System.out.println("Ödemeniz geren tutar: " + bSehriStandartFýyat
							+ "\n12 yaþýndan küçük olduðunuz için uygulanan %50 indirim sonrasý ödemeniz geren tutar :"
							+ (bSehriStandartFýyat / 2)
							+ "\nBiletinizi gidiþ-dönüþ aldýðýnýz için ekstra uygulanan %10 indirim sonrasý ödemeniz gereken tutar: "
							+ ((bSehriStandartFýyat / 2) - (bSehriStandartFýyat / 2) * 10 / 100)
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");

				} else if (gd == 0) {
					System.out.println("Ödemeniz geren tutar: " + bSehriStandartFýyat
							+ "\n12 yaþýndan küçük olduðunuz için uygulanan %50 indirim sonrasý ödemeniz geren tutar :"
							+ (bSehriStandartFýyat / 2)
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				}

			} else if (sehir == 2) {

				if (gd == 1) { // + %10 indirim
					System.out.println("Ödemeniz geren tutar: " + cSehriStandartFýyat
							+ "\n12 yaþýndan küçük olduðunuz için uygulanan %50 indirim sonrasý ödemeniz geren tutar :"
							+ (cSehriStandartFýyat / 2)
							+ "\nBiletinizi gidiþ-dönüþ aldýðýnýz için ekstra uygulanan %20 indirim sonrasý ödemeniz gereken tutar: "
							+ ((cSehriStandartFýyat / 2) - (cSehriStandartFýyat / 2) * 20 / 100)
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("Ödemeniz geren tutar: " + cSehriStandartFýyat
							+ "\n12 yaþýndan küçük olduðunuz için uygulanan %50 indirim sonrasý ödemeniz geren tutar :"
							+ (cSehriStandartFýyat / 2)
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				}

			} else if (sehir == 3) {
				if (gd == 1) {
					System.out.println("Ödemeniz geren tutar: " + dSehriStandartFýyat
							+ "\n12 yaþýndan küçük olduðunuz için uygulanan %50 indirim sonrasý ödemeniz geren tutar :"
							+ (dSehriStandartFýyat / 2)
							+ "\nBiletinizi gidiþ-dönüþ aldýðýnýz için ekstra uygulanan %10 indirim sonrasý ödemeniz gereken tutar: "
							+ ((dSehriStandartFýyat / 2) - (dSehriStandartFýyat / 2) * 10 / 100)
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("Ödemeniz geren tutar: " + dSehriStandartFýyat
							+ "\n12 yaþýndan küçük olduðunuz için uygulanan %50 indirim sonrasý ödemeniz geren tutar :"
							+ (dSehriStandartFýyat / 2)
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				}
			}

		} else if (yas < 24) {// %10 indirim
			if (sehir == 1) {
				if (gd == 1) {

				}
				System.out.println("Ödemeniz geren tutar: " + bSehriStandartFýyat
						+ "\n24 yaþýndan küçük olduðunuz için uygulanan %10 indirim sonrasý ödemeniz geren tutar :"
						+ (bSehriStandartFýyat - (bSehriStandartFýyat * 10 / 100))
						+ "\nBiletinizi gidiþ-dönüþ aldýðýnýz için ekstra uygulanan %20 indirim sonrasý ödemeniz gereken tutar: "
						+ ((bSehriStandartFýyat - (bSehriStandartFýyat * 10 / 100))
								- (bSehriStandartFýyat - (bSehriStandartFýyat * 10 / 100)) * 20 / 100)
						+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
			} else if (gd == 0) {
				System.out.println("Ödemeniz geren tutar: " + bSehriStandartFýyat
						+ "\n24 yaþýndan küçük olduðunuz için uygulanan %10 indirim sonrasý ödemeniz geren tutar :"
						+ (bSehriStandartFýyat - (bSehriStandartFýyat * 10 / 100))
						+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
			} else if (sehir == 2) {
				if (gd == 1) {
					System.out.println("Ödemeniz geren tutar: " + cSehriStandartFýyat
							+ "\n24 yaþýndan küçük olduðunuz için uygulanan %10 indirim sonrasý ödemeniz geren tutar :"
							+ (cSehriStandartFýyat - (cSehriStandartFýyat * 10 / 100))
							+ "\nBiletinizi gidiþ-dönüþ aldýðýnýz için ekstra uygulanan %20 indirim sonrasý ödemeniz gereken tutar: "
							+ ((cSehriStandartFýyat - (cSehriStandartFýyat * 10 / 100))
									- (cSehriStandartFýyat - (cSehriStandartFýyat * 10 / 100)) * 20 / 100)
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("Ödemeniz geren tutar: " + cSehriStandartFýyat
							+ "\n24 yaþýndan küçük olduðunuz için uygulanan %10 indirim sonrasý ödemeniz geren tutar :"
							+ (cSehriStandartFýyat - (cSehriStandartFýyat * 10 / 100))
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				} else if (sehir == 3) {
					if (gd == 1) {
						System.out.println("Ödemeniz geren tutar: " + dSehriStandartFýyat
								+ "\n24 yaþýndan küçük olduðunuz için uygulanan %10 indirim sonrasý ödemeniz geren tutar :"
								+ (dSehriStandartFýyat - (dSehriStandartFýyat * 10 / 100))
								+ "\nBiletinizi gidiþ-dönüþ aldýðýnýz için ekstra uygulanan %20 indirim sonrasý ödemeniz gereken tutar: "
								+ ((dSehriStandartFýyat - (dSehriStandartFýyat * 10 / 100))
										- (dSehriStandartFýyat - (dSehriStandartFýyat * 10 / 100)) * 20 / 100)
								+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
					} else if (gd == 0) {
						System.out.println("Ödemeniz geren tutar: " + dSehriStandartFýyat
								+ "\n24 yaþýndan küçük olduðunuz için uygulanan %10 indirim sonrasý ödemeniz geren tutar :"
								+ (dSehriStandartFýyat - (dSehriStandartFýyat * 10 / 100))
								+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
					}
				}
			}
		} else if (yas > 24 && yas < 66) {
			if (sehir == 1) {
				if (gd == 1) {
					System.out.println("Ödemeniz geren tutar: " + bSehriStandartFýyat
							+ "\nBiletinizi gidiþ-dönüþ aldýðýnýz için ekstra uygulanan %20 indirim sonrasý ödemeniz gereken tutar: "
							+ (bSehriStandartFýyat - (bSehriStandartFýyat * 20 / 100))
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("Ödemeniz geren tutar: " + bSehriStandartFýyat
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				}
			} else if (sehir == 2) {
				if (gd == 1) {
					System.out.println("Ödemeniz geren tutar: " + cSehriStandartFýyat
							+ "\nBiletinizi gidiþ-dönüþ aldýðýnýz için ekstra uygulanan %20 indirim sonrasý ödemeniz gereken tutar: "
							+ (cSehriStandartFýyat - (cSehriStandartFýyat * 20 / 100))
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("Ödemeniz geren tutar: " + bSehriStandartFýyat
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				}
			} else if (sehir == 3) {
				if (gd == 1) {
					System.out.println("Ödemeniz geren tutar: " + dSehriStandartFýyat
							+ "\nBiletinizi gidiþ-dönüþ aldýðýnýz için ekstra uygulanan %20 indirim sonrasý ödemeniz gereken tutar: "
							+ (dSehriStandartFýyat - (dSehriStandartFýyat * 20 / 100))
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("Ödemeniz geren tutar: " + dSehriStandartFýyat
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				}
			}
		} else if (yas > 65) {
			if (sehir == 1) {
				if (gd == 1) {
					System.out.println("Ödemeniz geren tutar: " + bSehriStandartFýyat
							+ "\n65 yaþýndan büyük olduðunuz için uygulanan %30 indirim sonrasý ödemeniz geren tutar :"
							+ (bSehriStandartFýyat - (bSehriStandartFýyat * 30 / 100))
							+ "\nBiletinizi gidiþ-dönüþ aldýðýnýz için ekstra uygulanan %20 indirim sonrasý ödemeniz gereken tutar: "
							+ ((bSehriStandartFýyat - (bSehriStandartFýyat * 30 / 100))
									- (bSehriStandartFýyat - (bSehriStandartFýyat * 30 / 100)) * 20 / 100)
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("Ödemeniz geren tutar: " + bSehriStandartFýyat
							+ "\n65 yaþýndan büyük olduðunuz için uygulanan %30 indirim sonrasý ödemeniz geren tutar :"
							+ (bSehriStandartFýyat - (bSehriStandartFýyat * 30 / 100))
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				}
			} else if (sehir == 2) {
				if (gd == 1) {
					System.out.println("Ödemeniz geren tutar: " + cSehriStandartFýyat
							+ "\n65 yaþýndan büyük olduðunuz için uygulanan %30 indirim sonrasý ödemeniz geren tutar :"
							+ (cSehriStandartFýyat - (cSehriStandartFýyat * 30 / 100))
							+ "\nBiletinizi gidiþ-dönüþ aldýðýnýz için ekstra uygulanan %20 indirim sonrasý ödemeniz gereken tutar: "
							+ ((cSehriStandartFýyat - (cSehriStandartFýyat * 30 / 100))
									- (cSehriStandartFýyat - (cSehriStandartFýyat * 30 / 100)) * 20 / 100)
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("Ödemeniz geren tutar: " + cSehriStandartFýyat
							+ "\n65 yaþýndan büyük olduðunuz için uygulanan %30 indirim sonrasý ödemeniz geren tutar :"
							+ (cSehriStandartFýyat - (cSehriStandartFýyat * 30 / 100))
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				}
			} else if (sehir == 3) {
				if (gd == 1) {
					System.out.println("Ödemeniz geren tutar: " + dSehriStandartFýyat
							+ "\n65 yaþýndan büyük olduðunuz için uygulanan %30 indirim sonrasý ödemeniz geren tutar :"
							+ (dSehriStandartFýyat - (dSehriStandartFýyat * 30 / 100))
							+ "\nBiletinizi gidiþ-dönüþ aldýðýnýz için ekstra uygulanan %20 indirim sonrasý ödemeniz gereken tutar: "
							+ ((dSehriStandartFýyat - (dSehriStandartFýyat * 30 / 100))
									- (dSehriStandartFýyat - (dSehriStandartFýyat * 30 / 100)) * 20 / 100)
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("Ödemeniz geren tutar: " + dSehriStandartFýyat
							+ "\n65 yaþýndan büyük olduðunuz için uygulanan %30 indirim sonrasý ödemeniz geren tutar :"
							+ (dSehriStandartFýyat - (dSehriStandartFýyat * 30 / 100))
							+ "\nBizi tercih etttiðiniz için teþekkür eder, iyi yolculuklar dileriz.");
				}
			}
		}

	} else {
		System.out.println("Lütfen geçerli deðerleri giriniz");
	}
			

	}

}
