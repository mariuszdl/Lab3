package pl.lublin.wsei.java.cwiczenia.lab3.test;

import pl.lublin.wsei.java.cwiczenia.lab3.Infografika;

public class TestInfografika {

    static String exItem = "<item>\n" +
            "\t\t\t<title><![CDATA[Infografika - Koniunktura gospodarcza w marcu 2022 r.]]></title>\n" +
            "\t\t\t<pubDate><![CDATA[Tue, 22 Mar 2022 16:00:00 +0100]]></pubDate>\n" +
            "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-marcu-2022-r-,38,69.html</link>\n" +
            "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-marcu-2022-r-,38,69.html</guid>\n" +
            "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/38/69/1/infografika_koniunktura_gospodarcza_03_2022.png\" type=\"image/png\" width=\"2362\" height=\"4548\">\n" +
            "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
            "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/69/1/infografika_koniunktura_gospodarcza_03_2022,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
            "\t\t\t</media:content>\n" +
            "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/69/1/infografika_koniunktura_gospodarcza_03_2022,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n" +
            "\t\t</item>";

    public static void main(String[] args) {
        Infografika infografika = new Infografika(exItem);

        System.out.println("Infografika:");
        System.out.println("\ttytul: " + infografika.tytul);
        System.out.println("\tadres strony: " + infografika.adresStrony);
        System.out.println("\tadres grafiki: " + infografika.adresGrafiki);
        System.out.println("\tadres miniaturki: " + infografika.adresMiniaturki);
        System.out.println("\trozmiary: " + infografika.szerokosc + "x" + infografika.wysokosc);
    }
}
