package ucusUcretHesaplama;

import java.util.Scanner;

public class UcusUcret {

	public static void main(String[] args) {
	
		/*
         * A �ehrinden u�amak isteyen bir ki�i B �ehrine 500km C �ehrine 700km D �ehrine
         * 900 km mesafededir. km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat
         * %50 indirim 12 ve 24 yas arasindaysa 10% indirim 65 yasindan buyukse 30%
         * indirim gidis donus bilet alirsa ya� indirimlerinden hari� 20% indirim bu
         * kosullara gore yolcudan gidece�i mesafeyi isteyip ucak bilet ucretini
         * hesaplayan program yaz�n�z
         */
		
		
		
		
		
	Scanner scan= new Scanner(System.in);
	System.out.println("'B' �ehrine bilet almak i�in 1'i, \n'C' �ehrine bilet almak i�in 2'yi, \n'D' �ehrine bilet almak i�in 3'� se�iniz: ");
	int sehir= scan.nextInt();
	  
	System.out.println("Biletinizi gidi�-d�n�� alacaksan�z '1', tek y�n alacaks�n�z '0' yaz�n�z:");
	int gd= scan.nextInt();
	
	System.out.println("L�tfen ya��n�z� giriniz: ");
	int yas= scan.nextInt();
	
	double bSehriStandartF�yat= 500*0.10;
	double cSehriStandartF�yat= 700*0.10;
	double dSehriStandartF�yat= 900*0.10;
	
	
	
	if (yas > 0) {

		if (yas < 12) { // %50 indirim

			if (sehir == 1) {

				if (gd == 1) { // + %10 indirim
					System.out.println("�demeniz geren tutar: " + bSehriStandartF�yat
							+ "\n12 ya��ndan k���k oldu�unuz i�in uygulanan %50 indirim sonras� �demeniz geren tutar :"
							+ (bSehriStandartF�yat / 2)
							+ "\nBiletinizi gidi�-d�n�� ald���n�z i�in ekstra uygulanan %10 indirim sonras� �demeniz gereken tutar: "
							+ ((bSehriStandartF�yat / 2) - (bSehriStandartF�yat / 2) * 10 / 100)
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");

				} else if (gd == 0) {
					System.out.println("�demeniz geren tutar: " + bSehriStandartF�yat
							+ "\n12 ya��ndan k���k oldu�unuz i�in uygulanan %50 indirim sonras� �demeniz geren tutar :"
							+ (bSehriStandartF�yat / 2)
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				}

			} else if (sehir == 2) {

				if (gd == 1) { // + %10 indirim
					System.out.println("�demeniz geren tutar: " + cSehriStandartF�yat
							+ "\n12 ya��ndan k���k oldu�unuz i�in uygulanan %50 indirim sonras� �demeniz geren tutar :"
							+ (cSehriStandartF�yat / 2)
							+ "\nBiletinizi gidi�-d�n�� ald���n�z i�in ekstra uygulanan %20 indirim sonras� �demeniz gereken tutar: "
							+ ((cSehriStandartF�yat / 2) - (cSehriStandartF�yat / 2) * 20 / 100)
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("�demeniz geren tutar: " + cSehriStandartF�yat
							+ "\n12 ya��ndan k���k oldu�unuz i�in uygulanan %50 indirim sonras� �demeniz geren tutar :"
							+ (cSehriStandartF�yat / 2)
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				}

			} else if (sehir == 3) {
				if (gd == 1) {
					System.out.println("�demeniz geren tutar: " + dSehriStandartF�yat
							+ "\n12 ya��ndan k���k oldu�unuz i�in uygulanan %50 indirim sonras� �demeniz geren tutar :"
							+ (dSehriStandartF�yat / 2)
							+ "\nBiletinizi gidi�-d�n�� ald���n�z i�in ekstra uygulanan %10 indirim sonras� �demeniz gereken tutar: "
							+ ((dSehriStandartF�yat / 2) - (dSehriStandartF�yat / 2) * 10 / 100)
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("�demeniz geren tutar: " + dSehriStandartF�yat
							+ "\n12 ya��ndan k���k oldu�unuz i�in uygulanan %50 indirim sonras� �demeniz geren tutar :"
							+ (dSehriStandartF�yat / 2)
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				}
			}

		} else if (yas < 24) {// %10 indirim
			if (sehir == 1) {
				if (gd == 1) {

				}
				System.out.println("�demeniz geren tutar: " + bSehriStandartF�yat
						+ "\n24 ya��ndan k���k oldu�unuz i�in uygulanan %10 indirim sonras� �demeniz geren tutar :"
						+ (bSehriStandartF�yat - (bSehriStandartF�yat * 10 / 100))
						+ "\nBiletinizi gidi�-d�n�� ald���n�z i�in ekstra uygulanan %20 indirim sonras� �demeniz gereken tutar: "
						+ ((bSehriStandartF�yat - (bSehriStandartF�yat * 10 / 100))
								- (bSehriStandartF�yat - (bSehriStandartF�yat * 10 / 100)) * 20 / 100)
						+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
			} else if (gd == 0) {
				System.out.println("�demeniz geren tutar: " + bSehriStandartF�yat
						+ "\n24 ya��ndan k���k oldu�unuz i�in uygulanan %10 indirim sonras� �demeniz geren tutar :"
						+ (bSehriStandartF�yat - (bSehriStandartF�yat * 10 / 100))
						+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
			} else if (sehir == 2) {
				if (gd == 1) {
					System.out.println("�demeniz geren tutar: " + cSehriStandartF�yat
							+ "\n24 ya��ndan k���k oldu�unuz i�in uygulanan %10 indirim sonras� �demeniz geren tutar :"
							+ (cSehriStandartF�yat - (cSehriStandartF�yat * 10 / 100))
							+ "\nBiletinizi gidi�-d�n�� ald���n�z i�in ekstra uygulanan %20 indirim sonras� �demeniz gereken tutar: "
							+ ((cSehriStandartF�yat - (cSehriStandartF�yat * 10 / 100))
									- (cSehriStandartF�yat - (cSehriStandartF�yat * 10 / 100)) * 20 / 100)
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("�demeniz geren tutar: " + cSehriStandartF�yat
							+ "\n24 ya��ndan k���k oldu�unuz i�in uygulanan %10 indirim sonras� �demeniz geren tutar :"
							+ (cSehriStandartF�yat - (cSehriStandartF�yat * 10 / 100))
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				} else if (sehir == 3) {
					if (gd == 1) {
						System.out.println("�demeniz geren tutar: " + dSehriStandartF�yat
								+ "\n24 ya��ndan k���k oldu�unuz i�in uygulanan %10 indirim sonras� �demeniz geren tutar :"
								+ (dSehriStandartF�yat - (dSehriStandartF�yat * 10 / 100))
								+ "\nBiletinizi gidi�-d�n�� ald���n�z i�in ekstra uygulanan %20 indirim sonras� �demeniz gereken tutar: "
								+ ((dSehriStandartF�yat - (dSehriStandartF�yat * 10 / 100))
										- (dSehriStandartF�yat - (dSehriStandartF�yat * 10 / 100)) * 20 / 100)
								+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
					} else if (gd == 0) {
						System.out.println("�demeniz geren tutar: " + dSehriStandartF�yat
								+ "\n24 ya��ndan k���k oldu�unuz i�in uygulanan %10 indirim sonras� �demeniz geren tutar :"
								+ (dSehriStandartF�yat - (dSehriStandartF�yat * 10 / 100))
								+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
					}
				}
			}
		} else if (yas > 24 && yas < 66) {
			if (sehir == 1) {
				if (gd == 1) {
					System.out.println("�demeniz geren tutar: " + bSehriStandartF�yat
							+ "\nBiletinizi gidi�-d�n�� ald���n�z i�in ekstra uygulanan %20 indirim sonras� �demeniz gereken tutar: "
							+ (bSehriStandartF�yat - (bSehriStandartF�yat * 20 / 100))
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("�demeniz geren tutar: " + bSehriStandartF�yat
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				}
			} else if (sehir == 2) {
				if (gd == 1) {
					System.out.println("�demeniz geren tutar: " + cSehriStandartF�yat
							+ "\nBiletinizi gidi�-d�n�� ald���n�z i�in ekstra uygulanan %20 indirim sonras� �demeniz gereken tutar: "
							+ (cSehriStandartF�yat - (cSehriStandartF�yat * 20 / 100))
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("�demeniz geren tutar: " + bSehriStandartF�yat
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				}
			} else if (sehir == 3) {
				if (gd == 1) {
					System.out.println("�demeniz geren tutar: " + dSehriStandartF�yat
							+ "\nBiletinizi gidi�-d�n�� ald���n�z i�in ekstra uygulanan %20 indirim sonras� �demeniz gereken tutar: "
							+ (dSehriStandartF�yat - (dSehriStandartF�yat * 20 / 100))
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("�demeniz geren tutar: " + dSehriStandartF�yat
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				}
			}
		} else if (yas > 65) {
			if (sehir == 1) {
				if (gd == 1) {
					System.out.println("�demeniz geren tutar: " + bSehriStandartF�yat
							+ "\n65 ya��ndan b�y�k oldu�unuz i�in uygulanan %30 indirim sonras� �demeniz geren tutar :"
							+ (bSehriStandartF�yat - (bSehriStandartF�yat * 30 / 100))
							+ "\nBiletinizi gidi�-d�n�� ald���n�z i�in ekstra uygulanan %20 indirim sonras� �demeniz gereken tutar: "
							+ ((bSehriStandartF�yat - (bSehriStandartF�yat * 30 / 100))
									- (bSehriStandartF�yat - (bSehriStandartF�yat * 30 / 100)) * 20 / 100)
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("�demeniz geren tutar: " + bSehriStandartF�yat
							+ "\n65 ya��ndan b�y�k oldu�unuz i�in uygulanan %30 indirim sonras� �demeniz geren tutar :"
							+ (bSehriStandartF�yat - (bSehriStandartF�yat * 30 / 100))
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				}
			} else if (sehir == 2) {
				if (gd == 1) {
					System.out.println("�demeniz geren tutar: " + cSehriStandartF�yat
							+ "\n65 ya��ndan b�y�k oldu�unuz i�in uygulanan %30 indirim sonras� �demeniz geren tutar :"
							+ (cSehriStandartF�yat - (cSehriStandartF�yat * 30 / 100))
							+ "\nBiletinizi gidi�-d�n�� ald���n�z i�in ekstra uygulanan %20 indirim sonras� �demeniz gereken tutar: "
							+ ((cSehriStandartF�yat - (cSehriStandartF�yat * 30 / 100))
									- (cSehriStandartF�yat - (cSehriStandartF�yat * 30 / 100)) * 20 / 100)
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("�demeniz geren tutar: " + cSehriStandartF�yat
							+ "\n65 ya��ndan b�y�k oldu�unuz i�in uygulanan %30 indirim sonras� �demeniz geren tutar :"
							+ (cSehriStandartF�yat - (cSehriStandartF�yat * 30 / 100))
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				}
			} else if (sehir == 3) {
				if (gd == 1) {
					System.out.println("�demeniz geren tutar: " + dSehriStandartF�yat
							+ "\n65 ya��ndan b�y�k oldu�unuz i�in uygulanan %30 indirim sonras� �demeniz geren tutar :"
							+ (dSehriStandartF�yat - (dSehriStandartF�yat * 30 / 100))
							+ "\nBiletinizi gidi�-d�n�� ald���n�z i�in ekstra uygulanan %20 indirim sonras� �demeniz gereken tutar: "
							+ ((dSehriStandartF�yat - (dSehriStandartF�yat * 30 / 100))
									- (dSehriStandartF�yat - (dSehriStandartF�yat * 30 / 100)) * 20 / 100)
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				} else if (gd == 0) {
					System.out.println("�demeniz geren tutar: " + dSehriStandartF�yat
							+ "\n65 ya��ndan b�y�k oldu�unuz i�in uygulanan %30 indirim sonras� �demeniz geren tutar :"
							+ (dSehriStandartF�yat - (dSehriStandartF�yat * 30 / 100))
							+ "\nBizi tercih ettti�iniz i�in te�ekk�r eder, iyi yolculuklar dileriz.");
				}
			}
		}

	} else {
		System.out.println("L�tfen ge�erli de�erleri giriniz");
	}
			

	}

}
