package com.apps.finalversion.tokidprojects.fragments.name;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.apps.finalversion.tokidprojects.R;

public class GirlsDetails extends AppCompatActivity {
    TextView Namem,Bangla,Arabic;
    private Button buttonBack;
   /* String data[] = new String[]{

            "Ayesha", "Aafreen", "Aaida", "Aakifa", "Amina", "Aamira", "Aanisa", "Aasfa", "Beena", "Bilqis", "Bushra ", "Begum",
            "Champa", "Chandni", "Chasheen", "Deeba", "Dilara", "Dilruba", "Diya", "Eira", "Eliza", "Erina", "Eva", "Fariha", "Fahmida", "Fahima",
            "Faiza", "Farhana", "Ghaliba", "Gulshan", "Gulzaar", "Hasna", "Habiba", "Hafsa", "Humaira", "Iffat-Ara", "Isa", "Israt Jahan", "Ismat-Ara",
            "Jannatul Ferdous", "Jahan", "Jahida", "Jasmin", "Jawda", "Johara", "Juhi", "Kaneez", "Kariman", "Kasturi", "Khadija", "Khushbu",
            "Labiba", "Laila", "Lamia", "Lamisa", "Leena", "Liza", "Lubaba", "Liyana",
            "Maliha", "Maisha", "Maahnoor", "Maha", "Mahbooba", "Naila", "Naazneen",
            "Nabila", "Nafisa", "Nilofar", "Nusrat", "Obaidiya", "Orzala", " Parveen", "Pakiza",
            "Qaifa", "Raisa", "Ramisa", "Rubaiya", "Rabeya", "Rajiya", "Rahela",
            "Sabiha", "Sultana", "Samiya", "Sharmin", "Shayla", "Samina", "Tasnim", "Tarin", "Tajin", "Tajnin",
            "Taniya", "Urmi", "Vanu", "Wasfiya", "Yesmin", "Zerin", "Zesmin"
    }; */

    String bangla[] = new String[]{
            "Wife of the Prophet (SAW)","Stimulation","Visiting, returning","A lady who worships Allah in solitude","Secured, Safe",
            "Prosperous","Young lady, Maiden","Protector, guardian","Seeing; clear sighted","Queen of Sheeba"," Good news, glad tidings","Honorific title, queen",
            "A Flower","The Moonlight","sweet","Brocade","Beloved, one who decorates heart","Heart-ravishing","Light",
            "Snow","Unique, precious","Beautiful lady","Life, Beloved","Happy, glad","Intelligent and Wise","Intelligent","Victorious",
            "Glad, joyful","Dominant","Rose-garden","Rosy-cheeked","Pious, beautiful woman","Beloved, darling","Cub; wife of Muhammad (pbuh); daughter of Khalifa Umar",
            "Of reddish complexion","Decorator of Chastity","Spacious, generous","Delightful world","Decorator of modesty","Garden of Paradise","Land",
            "Helps the vulnarable","Flower","Excellence, high",
            "Jewel","Fragrant flower","Slave","Generous lady","Musk, a song bird","The first wife of the Prophet Muhammad who was the first to embrace Islam",
            "Fragrance, scent","Intelligent, judicious, sensible, understanding",
            "Of the Night","Brilliant, lustrous, shining, radiant","Soft to touch","Plant of dates","Dedicated for Allah","Essence, core, gist",
            "Softness, tenderness","Beautiful, pretty, good-looking","Walking with a proud","Glow of Moon","Wild cow (representing beauty)",
            "Dear, beloved sweetheart","Acquirer, obtainer","Beautiful","Noble, highborn","Refined, pure","Waterlily","Help, aid, assistance","Bondswoman of Allah","Brightness of Fire",
            "Very Noble","Pure, chaste, polite","Estimater","Raisa","Ramisa","Rubaiya","Rabeya","Rajiya","Rahela",
            "Sabiha", "Sultana","Samiya","Sharmin","Shayla","Samina","Tasnim","Tarin","Tajin","Tajnin",
            "Taniya","Urmi","Vanu","Wasfiya","Yesmin","Zerin","Zesmin"

    };

    String arabic[] = new String[]{
            "شغساش","شبقثثى","30","40","50","60","70","80","90","100","110","120","130"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls_details);

        Namem = findViewById(R.id.name);
        Bangla = findViewById(R.id.banglaName);
        Arabic = findViewById(R.id.arabikName);

        buttonBack = findViewById(R.id.back);



        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Intent secondIntent = getIntent( );

        String name = secondIntent.getStringExtra("Name");

        if(name.equals("Ayesha")){
            Namem.setText(name);
            Bangla.setText("Wife of the Prophet (SAW)");
            Arabic.setText("شغساش");
        }
        else if(name.equals("Aafreen")){
            Namem.setText(name);
            Bangla.setText("Stimulation");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Aaida")){
            Namem.setText(name);
            Bangla.setText("Visting, returning");
            Arabic.setText("ششهيش");
        }
        else if(name.equals("Aakifa")){
            Namem.setText(name);
            Bangla.setText("A lady who worships Allah in solitude");
            Arabic.setText("شنهبش");
        }
        else if(name.equals("Amina")){
            Namem.setText(name);
            Bangla.setText("Secured, Safe");
            Arabic.setText("شةمىش");
        }
        else if(name.equals("Aamira")){
            Namem.setText(name);
            Bangla.setText("Prosperous");
            Arabic.setText("ششةهقش");
        }
        else if(name.equals("Aanisa")){
            Namem.setText(name);
            Bangla.setText("Young lady, Maiden");
            Arabic.setText("ششىهساش");
        }
        else if(name.equals("Aasfa")){
            Namem.setText(name);
            Bangla.setText("Protector, Gaurdian");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Beena")){
            Namem.setText(name);
            Bangla.setText("Seeing; clear sighted");
            Arabic.setText("لاثثى");
        }
        else if(name.equals("Bilqis")){
            Namem.setText(name);
            Bangla.setText("Queen of Sheeba");
            Arabic.setText("لاهمضهسbb");
        }
        else if(name.equals("Bushra")){
            Namem.setText(name);
            Bangla.setText(" Good news, glad tidings");
            Arabic.setText("لاعساقش");
        }
        else if(name.equals("Begum")){
            Namem.setText(name);
            Bangla.setText("Honorific title, queen");
            Arabic.setText("لاثلعة");
        }
        else if(name.equals("Champa")){
            Namem.setText(name);
            Bangla.setText("A flower");
            Arabic.setText("ؤاشةحش");
        }
        else if(name.equals("Chandni")){
            Namem.setText(name);
            Bangla.setText("The Moonlight");
            Arabic.setText("ؤاشىيه");
        }
        else if(name.equals("Chasheen")){
            Namem.setText(name);
            Bangla.setText("Sweet");
            Arabic.setText("ؤاشساثثى");
        }
        else if(name.equals("Deeba")){
            Namem.setText(name);
            Bangla.setText("Brocade");
            Arabic.setText("يثثلاش");
        }
        else if(name.equals("Dilara")){
            Namem.setText(name);
            Bangla.setText("Beloved, one who decorates heart");
            Arabic.setText("يهمشقش");
        }
        else if(name.equals("Dilruba")){
            Namem.setText(name);
            Bangla.setText("Heart-ravishing");
            Arabic.setText("يهمقعلاش");
        }
        else if(name.equals("Diya")){
            Namem.setText(name);
            Bangla.setText("Light");
            Arabic.setText("يهغش");
        }
        else if(name.equals("Eira")){
            Namem.setText(name);
            Bangla.setText("Snow");
            Arabic.setText("ثهقش");
        }
        else if(name.equals("Eliza")){
            Namem.setText(name);
            Bangla.setText("Unique, precious");
            Arabic.setText("ثمهئش");
        }
        else if(name.equals("Erina")){
            Namem.setText(name);
            Bangla.setText("Beautiful lady");
            Arabic.setText("ثقهىش");
        }
        else if(name.equals("Eva")){
            Namem.setText(name);
            Bangla.setText("Life, Beloved");
            Arabic.setText("ثرش");
        }
        else if(name.equals("Fariha")){
            Namem.setText(name);
            Bangla.setText("Happy, glad");
            Arabic.setText("بشقهاش");
        }
        else if(name.equals("Fahmida")){
            Namem.setText(name);
            Bangla.setText("Intelligent and Wise");
            Arabic.setText("بشاةهيش");
        }
        else if(name.equals("Fahima")){
            Namem.setText(name);
            Bangla.setText("Intelligent");
            Arabic.setText("بشاهةش");
        }
        else if(name.equals("Faiza")){
            Namem.setText(name);
            Bangla.setText("Victorious");
            Arabic.setText("بشهئش");
        }
        else if(name.equals("Farhana")){
            Namem.setText(name);
            Bangla.setText("Glad, joyful");
            Arabic.setText("بشقاشىش");
        }
        else if(name.equals("Ghaliba")){
            Namem.setText(name);
            Bangla.setText("لاشمهلاش");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Gulshan")){
            Namem.setText(name);
            Bangla.setText("Rose-garden");
            Arabic.setText("لعمساشى");
        }
        else if(name.equals("Gulzaar")){
            Namem.setText(name);
            Bangla.setText("Rose-garden");
            Arabic.setText("لعمتششق");
        }
        else if(name.equals("Hasna")){
            Namem.setText(name);
            Bangla.setText("Pious, beautiful woman");
            Arabic.setText("اشسىش");
        }
        else if(name.equals("Habiba")){
            Namem.setText(name);
            Bangla.setText("Beloved, darling");
            Arabic.setText("اشلاهلاش");
        }
        else if(name.equals("Hafsa")){
            Namem.setText(name);
            Bangla.setText("Cub; wife of Muhammad (pbuh); daughter of Khalifa Umar");
            Arabic.setText("اشبسش");
        }
        else if(name.equals("Humaira")){
            Namem.setText(name);
            Bangla.setText("Of reddish complexion");
            Arabic.setText("اعةشهقش");
        }
        else if(name.equals("Iffat-Ara")){
            Namem.setText(name);
            Bangla.setText("Decorator of Chastity");
            Arabic.setText("هببشف-شقش");
        }
        else if(name.equals("Isa")){
            Namem.setText(name);
            Bangla.setText("Spacious, generous");
            Arabic.setText("هسش");
        }
        else if(name.equals("Israt Jahan")){
            Namem.setText(name);
            Bangla.setText("Delightful world");
            Arabic.setText("هسقشف تشاشى");
        }
        else if(name.equals("Ismat-Ara")){
            Namem.setText(name);
            Bangla.setText("Decorator of modesty");
            Arabic.setText("هسةشف-شقش");
        }
        else if(name.equals("Jannatul Ferdous")){
            Namem.setText(name);
            Bangla.setText("Garden of Paradise");
            Arabic.setText("تشىىشفعم بثقيخعس");
        }
        else if(name.equals("Jahan")){
            Namem.setText(name);
            Bangla.setText("Land");
            Arabic.setText("تشاشى");
        }
        else if(name.equals("Jahida")){
            Namem.setText(name);
            Bangla.setText("Helps the vulnarable");
            Arabic.setText("تشاهيش");
        }
        else if(name.equals("Jasmin")){
            Namem.setText(name);
            Bangla.setText("Flower");
            Arabic.setText("تشسةهى");
        }
        else if(name.equals("Jawda")){
            Namem.setText(name);
            Bangla.setText("Excellence, high");
            Arabic.setText("تشصيش");
        }
        else if(name.equals("Johara")){
            Namem.setText(name);
            Bangla.setText("Jewel");
            Arabic.setText("تخاشقش");
        }
        else if(name.equals("Juhi")){
            Namem.setText(name);
            Bangla.setText("Fragrant flower");
            Arabic.setText("تعاه");
        }
        else if(name.equals("Kaneez")){
            Namem.setText(name);
            Bangla.setText("Slave");
            Arabic.setText("نشىثثئ");
        }
        else if(name.equals("Kariman")){
            Namem.setText(name);
            Bangla.setText("Generous lady");
            Arabic.setText("نشقهةشى");
        }
        else if(name.equals("Kasturi")){
            Namem.setText(name);
            Bangla.setText("Musk, a song bird");
            Arabic.setText("نشسفعقه");
        }
        else if(name.equals("Khadija")){
            Namem.setText(name);
            Bangla.setText("The first wife of the Prophet Muhammad who was the first to embrace Islam");
            Arabic.setText("ناشيهتش");
        }
        else if(name.equals("Khushbu")){
            Namem.setText(name);
            Bangla.setText("Fragrance, scent");
            Arabic.setText("ناعسالاع");
        }
        else if(name.equals("Labiba")){
            Namem.setText(name);
            Bangla.setText("Intelligent, judicious, sensible, understanding");
            Arabic.setText("مشلاهلاش");
        }
        else if(name.equals("Laila")){
            Namem.setText(name);
            Bangla.setText("Of the Night");
            Arabic.setText("مشهمش");
        }
        else if(name.equals("Lamia")){
            Namem.setText(name);
            Bangla.setText("Brilliant, lustrous, shining, radiant");
            Arabic.setText("مشةهغش");
        }
        else if(name.equals("Lamisa")){
            Namem.setText(name);
            Bangla.setText("Soft to touch");
            Arabic.setText("مشةهسش");
        }
        else if(name.equals("Leena")){
            Namem.setText(name);
            Bangla.setText("Plant of dates");
            Arabic.setText("مثثىش");
        }
        else if(name.equals("Liza")){
            Namem.setText(name);
            Bangla.setText("Dedicated for Allah");
            Arabic.setText("مهئش");
        }
        else if(name.equals("Lubaba")){
            Namem.setText(name);
            Bangla.setText("Essence, core, gist");
            Arabic.setText("معلاشلاش");
        }
        else if(name.equals("Liyana")){
            Namem.setText(name);
            Bangla.setText("Softness, tenderness");
            Arabic.setText("معلاشلاش");
        }
        else if(name.equals("Maliha")){
            Namem.setText(name);
            Bangla.setText("Beautiful, pretty, good-looking");
            Arabic.setText("ةشمهاش");
        }
        else if(name.equals("Maisha")){
            Namem.setText(name);
            Bangla.setText("Walking with a proud");
            Arabic.setText("ةشهساش");
        }
        else if(name.equals("Mahnoor")){
            Namem.setText(name);
            Bangla.setText("Glow of Moon");
            Arabic.setText("ةشاىخخق");
        }

        else if(name.equals("Maha")){
            Namem.setText(name);
            Bangla.setText("Wild cow (representing beauty)");
            Arabic.setText("ةشاش");
        }

        else if(name.equals("Mahbooba")){
            Namem.setText(name);
            Bangla.setText("Dear, beloved sweetheart");
            Arabic.setText("ةشالاخخلاش");
        }
        else if(name.equals("Naila")){
            Namem.setText(name);
            Bangla.setText("Acquirer, obtainer");
            Arabic.setText("ىشهمش");
        }
        else if(name.equals("Naazneen")){
            Namem.setText(name);
            Bangla.setText("Beautiful");
            Arabic.setText("ىششئىثثى");
        }
        else if(name.equals("Nabila")){
            Namem.setText(name);
            Bangla.setText("Noble, highborn");
            Arabic.setText("ىشلاهمش");
        }
        else if(name.equals("Nafisa")){
            Namem.setText(name);
            Bangla.setText("Refined, pure");
            Arabic.setText("ىشبهسش");
        }
        else if(name.equals("Nilofar")){
            Namem.setText(name);
            Bangla.setText("Waterlily");
            Arabic.setText("ىهمخبشق");
        }
        else if(name.equals("Nusrat")){
            Namem.setText(name);
            Bangla.setText("Help, aid, assistance");
            Arabic.setText("ىعسقشف");
        }
        else if(name.equals("Obaidiya")){
            Namem.setText(name);
            Bangla.setText("Bondswoman of Allah");
            Arabic.setText("خلاشهيهغش");
        }
        else if(name.equals("Orzala")){
            Namem.setText(name);
            Bangla.setText("Brightness of Fire");
            Arabic.setText("خقئشمش");
        }
        else if(name.equals("Parveen")){
            Namem.setText(name);
            Bangla.setText("Very Noble");
            Arabic.setText("حشقررثى");
        }
        else if(name.equals("Pakiza")){
            Namem.setText(name);
            Bangla.setText("Pure, chaste, polite");
            Arabic.setText("حشنهئش");
        }
        else if(name.equals("Qaifa")){
            Namem.setText(name);
            Bangla.setText("Estimater");
            Arabic.setText("ضشهبش");
        }
        else if(name.equals("Raha")){
            Namem.setText(name);
            Bangla.setText("Peaceful");
            Arabic.setText("قشاش");
        }
        else if(name.equals("Raisa")){
            Namem.setText(name);
            Bangla.setText("Chief, leader");
            Arabic.setText("قشهسش");
        }
        else if(name.equals("Rihana")){
            Namem.setText(name);
            Bangla.setText("Sweet basil");
            Arabic.setText("قهاشىش");
        }
        else if(name.equals("Rubaiya")){
            Namem.setText(name);
            Bangla.setText("Spring season");
            Arabic.setText("قعلاشهغش");
        }
        else if(name.equals("Reshma")){
            Namem.setText(name);
            Bangla.setText("Golden Silk, Expensive");
            Arabic.setText("قثساشة");
        }
        else if(name.equals("Rubina")){
            Namem.setText(name);
            Bangla.setText("Face reader");
            Arabic.setText("قعلاهىش");
        }
        else if(name.equals("Rahela")){
            Namem.setText(name);
            Bangla.setText("One who travels");
            Arabic.setText("قشاثمش");
        }
        else if(name.equals("Saadia")){
            Namem.setText(name);
            Bangla.setText("Lucky");
            Arabic.setText("سششيهش");
        }
        else if(name.equals("Saara")){
            Namem.setText(name);
            Bangla.setText("Wife of the Prophet Ibrahim and mother of the Prophet Ismail");
            Arabic.setText("سششقش");
        }
        else if(name.equals("Sabeera")){
            Namem.setText(name);
            Bangla.setText("Patient, tolerant");
            Arabic.setText("سشلاثثقش");
        }
        else if(name.equals("Sabiha")){
            Namem.setText(name);
            Bangla.setText("Coming or arriving in the morning");
            Arabic.setText("سشلاهاش");
        }
        else if(name.equals("Sabrina")){
            Namem.setText(name);
            Bangla.setText("Princess, daughter of the king");
            Arabic.setText("سشلاقهىش");
        }
        else if(name.equals("Safa")){
            Namem.setText(name);
            Bangla.setText("A hill near the sacred Kaaba; stone, rock");
            Arabic.setText("سشبش");
        }
        else if(name.equals("Sitara")){
            Namem.setText(name);
            Bangla.setText("veil, screen, curtain");
            Arabic.setText("سهفشقش");
        }
        else if(name.equals("Tasnim")){
            Namem.setText(name);
            Bangla.setText("Fountain of paridise");
            Arabic.setText("فشسىهة");
        }
        else if(name.equals("Tanzila")){
            Namem.setText(name);
            Bangla.setText("Revelation, sending down");
            Arabic.setText("فشىئهمش");
        }
        else if(name.equals("Tuba")){
            Namem.setText(name);
            Bangla.setText("The name of a tree in heaven");
            Arabic.setText("فعلاش");
        }
        else if(name.equals("Tisha")){
            Namem.setText(name);
            Bangla.setText("One who is active, lively");
            Arabic.setText("فهساش");
        }
        else if(name.equals("Tahmina")){
            Namem.setText(name);
            Bangla.setText("Clever");
            Arabic.setText("فشاةهىش");
        }
        else if(name.equals("Umaiza")){
            Namem.setText(name);
            Bangla.setText("Bright, beautiful and soft hearted");
            Arabic.setText("عةشهئش");
        }
        else if(name.equals("Unaiza")){
            Namem.setText(name);
            Bangla.setText("Sheep/Goat, Name of a Valley between Makkah and Taif");
            Arabic.setText("عىشهئش");
        }
        else if(name.equals("Urshia")){
            Namem.setText(name);
            Bangla.setText("One who belongs in the skies");
            Arabic.setText("عقساهش");
        }
        else if(name.equals("Varisha")){
            Namem.setText(name);
            Bangla.setText(" Lightning");
            Arabic.setText("رشقهساش");
        }
        else if(name.equals("Wabisa")){
            Namem.setText(name);
            Bangla.setText("Something Bright");
            Arabic.setText("صشلاهسش");
        }
        else if(name.equals("Wasfia")){
            Namem.setText(name);
            Bangla.setText("Depictive");
            Arabic.setText("صشسبهش");
        }
        else if(name.equals("Yesmin")){
            Namem.setText(name);
            Bangla.setText("A beautiful flower that shines");
            Arabic.setText("غثسةهى");
        }
        else if(name.equals("Zaara")){
            Namem.setText(name);
            Bangla.setText("Beautiful Flower");
            Arabic.setText("ئششقش");
        }
        else if(name.equals("Zerin")){
            Namem.setText(name);
            Bangla.setText("Just like Gold");
            Arabic.setText("ئثقهى");
        }
        else if(name.equals("Zeenat")){
            Namem.setText(name);
            Bangla.setText("Adornment, ornament, decoration, elegance, beauty");
            Arabic.setText("ئثثىشف");
        }







    }
}
