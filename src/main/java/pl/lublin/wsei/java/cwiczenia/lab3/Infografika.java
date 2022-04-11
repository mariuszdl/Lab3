package pl.lublin.wsei.java.cwiczenia.lab3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {

    public String tytul;
    public String adresStrony;
    public String adresMiniaturki;
    public String adresGrafiki;
    public int szerokosc;
    public int wysokosc;

    public Infografika(String tekst) {
        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(tekst);
        if(m.find()) {
            tytul = m.group(1);
        } else {
            tytul = "";
        }

        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher(tekst);
        if(m.find()) {
            adresStrony = m.group(1);
        } else {
            adresStrony = "";
        }

        pat = Pattern.compile("<media:thumbnail url=\"([^\"]*)\"");
        m = pat.matcher(tekst);
        if(m.find()) {
            adresMiniaturki = m.group(1);
        } else {
            adresMiniaturki = "";
        }

        pat = Pattern.compile("<media:content url=\"([^\"]*)\"(.*)width=\"([^\"]*)\".height=\"([^\"]*)");
        m = pat.matcher(tekst);
        if(m.find()) {
            adresGrafiki = m.group(1);
            szerokosc = Integer.parseInt(m.group(3));
            wysokosc = Integer.parseInt(m.group(4));
        } else {
            adresGrafiki = "";
            szerokosc = 0;
            wysokosc = 0;
        }
    }
}
