package kelimeOyunu;

import java.util.Scanner;

public class KelimeOyunu {

	public static void main(String[] args) {
		/*
		 * Iki kisinin oynayacagi bir kelime oyunu uretelim Kurallar 1.Adým- Baslangicta
		 * 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
		 *
		 * 2.Adým- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini
		 * sorun. * 2. oyuncu Eger kelimeyi kabul ederse 1.oyuncuya kelimedeki harf
		 * sayisi kadar puan ekleyin ve 3.adima gecin * girilen kelimeyi kabul etmezse
		 * "gecersiz kelime" yazdirin ve hangi oyuncunun kazandigini yazip oyunu
		 * bitirin.
		 *
		 * 3.Adým- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun * devam
		 * etmek isterse kelimeye eklemek istedigi string'i ve basa mi sona mi
		 * ekleyecegini sorun aldiginiz string'i kelimeye ekleyip 2.adima gidin
		 *
		 * * Devam etmek istemezse "Oyun bitti" yazin kullanicilarin puanlarini ve
		 * kazanan oyuncuyu yazdirin
		 */

		System.out.println("***** KELÝME OYUNUNA HOÞGELDÝNÝZ *****");

		Scanner scan = new Scanner(System.in);

		int birinciOyuncuPuan = 0;
		int ikinciOyuncuPuan = 0;
		String kelimeToplam = "";
		String kelime = "";
		int elSayýsý = 1;
		char basSon = ' ';
		char basýna = 'B';
		char sonuna = 'S';
		char oyunaDevam = 'E';
		char kelimeKabul = 'E';
		int ilkEkBirinciOyuncuPuan = 0;

		do {

			if (elSayýsý == 1) {

				System.out.println("\nLütfen Oyuna Baþlamak Ýstediðiniz Kelimeyi Giriniz: ");
				kelimeToplam += scan.next().trim();
				System.out.println("Girilen kelime: " + kelimeToplam);
				ilkEkBirinciOyuncuPuan = kelimeToplam.length();

			} else {

				System.out.println(
						"Lütfen eklemek istediðiniz kelimeyi mevcut kelimenin baþýna mý yoksa sonuna mý ekleyeceðinizi belirtin: 'BAÞINA' ya da 'SONUNA' ");
				basSon = scan.next().toUpperCase().charAt(0);

				if (basSon == 'B') {

					System.out.println("Lütfen kelimenin baþýna eklemek istediðiniz kelimeyi giriniz: ");

					kelime = scan.next().trim();

					kelimeToplam = kelime + kelimeToplam;

					System.out.println("Mevcut kelime: " + kelimeToplam);

				} else if (basSon == 'S') {

					System.out.println("Lütfen kelimenin sonuna eklemek istediðiniz kelimeyi giriniz: ");

					kelime = scan.next().trim();

					kelimeToplam += kelime;

					System.out.println("Mevcut kelime: " + kelimeToplam);
				}

			}

			System.out.println("1. Oyuncu'nun girdiði kelimeyi kabul ediyor musunuz? 'EVET' ya da 'HAYIR' ");
			kelimeKabul = scan.next().toUpperCase().charAt(0);

			if (kelimeKabul == 'E') {

				birinciOyuncuPuan += kelime.length();

				System.out.println("Oyuna devam etmek istiyor musunuz? 'EVET' ya da 'HAYIR'");
				oyunaDevam = scan.next().toUpperCase().charAt(0);

				if (oyunaDevam == 'E') {

					elSayýsý += 2;

					System.out.println(
							"Lütfen eklemek istediðiniz kelimeyi mevcut kelimenin baþýna mý yoksa sonuna mý ekleyeceðinizi belirtin: 'BAÞINA' ya da 'SONUNA' ");
					basSon = scan.next().toUpperCase().charAt(0);

					if (basSon == 'B') {

						System.out.println("Lütfen kelimenin baþýna eklemek istediðiniz kelimeyi giriniz: ");

						kelime = scan.next().trim();
						kelimeToplam = kelime + kelimeToplam;

						System.out.println("Mevcut kelime: " + kelimeToplam);

					} else if (basSon == 'S') {

						System.out.println("Lütfen kelimenin sonuna eklemek istediðiniz kelimeyi giriniz: ");

						kelime = scan.next().trim();
						kelimeToplam += kelime;

						System.out.println("Mevcut kelime: " + kelimeToplam);

					}

				} else {

					birinciOyuncuPuan += ilkEkBirinciOyuncuPuan;
					elSayýsý--;

					if (birinciOyuncuPuan > ikinciOyuncuPuan) {
						System.out.println("Oyunu kazanan 1. oyuncu: \n1. oyuncu puan: " + birinciOyuncuPuan
								+ "\n2. oyuncu puan: " + ikinciOyuncuPuan + "\n***TEBRÝKLER 1. OYUNCU***");
					} else if (birinciOyuncuPuan < ikinciOyuncuPuan) {
						System.out.println("Oyunu kazanan 2. oyuncu: \n2. oyuncu puan: " + ikinciOyuncuPuan
								+ "\n1. oyuncu puan: " + birinciOyuncuPuan + "\n***TEBRÝKLER 2. OYUNCU***");
					} else {
						System.out.println("Dostluk kazandý.");
					}

				}

			} else {

				birinciOyuncuPuan += ilkEkBirinciOyuncuPuan;
				elSayýsý--;

				System.out.println("Geçersiz kelime!");

				if (birinciOyuncuPuan > ikinciOyuncuPuan) {
					System.out.println("Kazanan 1. Oyuncu! \n1. Oyuncu puan: " + birinciOyuncuPuan
							+ "\n2. oyuncu puan: " + ikinciOyuncuPuan + "\n***TEBRÝKLER 1. OYUNCU***");
				} else {
					System.out.println("Kazanan 2. Oyuncu! \n2. Oyuncu puan: " + ikinciOyuncuPuan + "\n1. oyuncu puan: "
							+ birinciOyuncuPuan + "\n***TEBRÝKLER 2. OYUNCU***");
				}
			}

			if (!(elSayýsý % 2 == 0)) {

				System.out.println("2. Oyuncu'nun girdiði kelimeyi kabul ediyor musunuz? 'EVET' ya da 'HAYIR' ");
				kelimeKabul = scan.next().toUpperCase().charAt(0);

				if (kelimeKabul == 'E') {

					ikinciOyuncuPuan += kelime.length();

					System.out.println("Oyuna devam etmek istiyor musunuz? 'EVET' ya da 'HAYIR'");
					oyunaDevam = scan.next().toUpperCase().charAt(0);

					if (oyunaDevam == 'E') {

					} else {
						birinciOyuncuPuan += ilkEkBirinciOyuncuPuan;

						if (birinciOyuncuPuan > ikinciOyuncuPuan) {
							System.out.println("Oyunu kazanan 1. oyuncu: \n1. oyuncu puan: " + birinciOyuncuPuan
									+ "\n2. oyuncu puan: " + ikinciOyuncuPuan + "\n***TEBRÝKLER 1. OYUNCU***");
						} else {
							System.out.println("Oyunu kazanan 2. oyuncu: \n2. oyuncu puan: " + ikinciOyuncuPuan
									+ "\n1. oyuncu puan: " + birinciOyuncuPuan + "\n***TEBRÝKLER 2. OYUNCU***");

						}

					}

				} else {
					birinciOyuncuPuan += ilkEkBirinciOyuncuPuan;

					if (birinciOyuncuPuan > ikinciOyuncuPuan) {
						System.out.println("Oyunu kazanan 1. oyuncu: \n1. oyuncu puan: " + birinciOyuncuPuan
								+ "\n2. oyuncu puan: " + ikinciOyuncuPuan + "\n***TEBRÝKLER 1. OYUNCU***");
					} else {
						System.out.println("Oyunu kazanan 2. oyuncu: \n2. oyuncu puan: " + ikinciOyuncuPuan
								+ "\n1. oyuncu puan: " + birinciOyuncuPuan + "\n***TEBRÝKLER 2. OYUNCU***");

					}

				}

			} else {

				oyunaDevam = 'H';
			}

		} while (kelimeKabul == 'E' && oyunaDevam == 'E');

	}

}
