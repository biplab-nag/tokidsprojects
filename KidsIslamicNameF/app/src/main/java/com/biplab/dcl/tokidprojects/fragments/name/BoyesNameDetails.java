package com.biplab.dcl.tokidprojects.fragments.name;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.biplab.dcl.tokidprojects.R;

public class BoyesNameDetails extends AppCompatActivity {

    private Button buttonBack;

    TextView Namem,Bangla,Arabic;


//    String data[] = new String[]{
//
//            " Aban", "Abdar", "Abis", "Adhil", " Alam ", "Aahil", "Aalim","Aamir", "Aaqib", "Aarib", "Aarif", "Aariz", "Aarzu",
//            "Baariq", "Baasir", "Babar", "Badiul Alam", " Badruddin", "Barkat","Baseem", "Bayazid", "Changeez", "Chinar", "Dawud", "Dabir",
//            "Dastgir", "Daulat", "Dayyan", "Ehsaan", "Ejaz", "Emad", "Emran","Firyal", "Forouzan", "Fakhar", "Falahat",
//            "Fanan", "Gahez","Ghalib","Ghazi","Haafiz","Habib","Hadad","Hakeem","Hameem","Hamid",
//            "Harith","Haseeb","Ibrahim","Iftikhar","Ihtisham","Imaad","Imam","Imran",
//            "Jaban","Jabir","Jaheer","Jahid","Jamil","Jamshed","Kabir","Kadar","Kahil","Kaif","Kaiser","Kalam",
//            "Kamran","Labib","Latif","Lutfur","Laraib","Liaquat","Liban","Mamun"," Maahir","Mahad","Mifzal",
//            "Meerab","Miraj","Misbah","Naadir","Nabeel","Nadim","Naeem","Nafis","Nahyan","Omeed","Omar","Obayed",
//            "Parvez","Pamir","Pasha","Qader","Qabeel","Qaanit","Raafe","Raahil","Raashid","Raem","Rafan","Raghib",
//            "Rahat","Rajeel",
//            "Saad","Saadat","Saafi","Saamir","Saaqib","Sabeer","Sabit","Shadab","Siham","Sohrab","Taahid",
//            "Tahmid","Tahsin","Talab","Tawqir","Tawseef", " Toymur","Taysir","Turhan","Uhban","Ulfat","Usman","Wahab","Wahid","Waleed","Waqar",
//            "Yaamin","Yusuf","Yasin","Yasir","Zaakir","Zabir","Zubair","Zohaib"
//    };

    String bangla[] = new String[]{
            "angel of iron", "Bright, like glass", "Lucky", "Honorable Judge", "The world", "Prince",
            "Scholar Plural is ulama normally used for religious scholors","Civilised", "Follower", "Handsome", "Knowing", "Leader, ruler, leader of nation", "Wish, hope",
            "Shining, lightning", "Seeing, wise", "Tiger", "Unique in the world", "Full moon of religion",
            "blessing","Sagacious", "Smiling"," Name of a saint", "Chengiz Khan", "A Tree", "A Prophet's Name", "Root, origin",
            "Protector, saint","Wealth","A mighty Ruler"," Favour","Miracle","Leader","Progress","Old Arabic name","Shining","Honour, pride","Welfare, benefit",
            "Tree branch or twig","Morning","Conqueror","Conqueror, hero",
            "Title of a man who has memorized the whole Quran","Beloved, dear",
            "Syrian god of fertility","Wise, sage","Friend","Praiser","Ploughman, cultivator","Respected, esteemed","Kind father","Honour, grace",
            "Modesty, decency","Pillar","One who leads communal prayer","Long lived","Soft hearted","Consoler, restorer","Handsome man",
            "Diligent, hardworking, striving","Beautiful","The sun in Pisces","Great","Powerful","Friend, lover","State, condition",
            "Emperor, King","Speech, conversation","Lucky, happy"," Intelligent","Kind, gracious","Favour of the All-merciful","Faultless, pure",
            "Decorum, decency","Succesfull, charmed","Trustworthy, reliable","Skillful, able","Great, nice",
            "Great and blessed person","Paradise Flower","Place of ascent","Lamp, lantern","Dear, Rare","Handsome, intelligint",
            "Friend, companion","Happiness, comfort","Precious","Stopper","Hope","Long-Lived","Small Slave","Success. Name of a Persian King",
            "Helper, constant perfect","Lord, honorific title","Powerful","Famous son of Adam","Satisfied,contented",
            "A companion","Path guider","Major, Adult","One who has a desire and searches","Beautiful, graceful",
            "Willing, desirous","Rest, Repose","One who walks too much","Good luck","Prosperity, happiness","Pure, clear","Fruit-bearing",
            "Star","Patient","Strong, well-established","Fresh, evergreen.","Arrows; pl. of Sahm"," Champion",
            "To console, to guard","Praising Allah","Adornment","Demand","Honour, great respect","Praise",
            "Brave strong","Facilitation","Of mercy","Ibn Aws al-Aslani RA,","Love, affection","The young of a lark","Giving","One, unique","Newborn Child",
            "Majesty","Blessed, auspicious","A Prophet", "The opening letters of the first verse of surat Ya Sin ",
            "Easy, wealthy","Rememberer of Allah","The person who have Religious Knowledge","Strong, powerful, smart","Golden"
    };

    String arabic[] = new String[]{
            "شلاشى","شلايشق","30","40","50","60","70","80","90","100","110","120","130"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boyes_name_details);

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

        if(name.equals("Aban")){
            Namem.setText(name);
            Bangla.setText("angel of iron");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Abdar")){
            Namem.setText(name);
            Bangla.setText("Bright, like glass");
            Arabic.setText("شلايشق");
        }

        else if(name.equals("Abis")){
            Namem.setText(name);
            Bangla.setText("Lucky");
            Arabic.setText("شلاهس");
        }
        else if(name.equals("Adhil")){
            Namem.setText(name);
            Bangla.setText("Honorable Judge");
            Arabic.setText("شياهم");
        }
        else if(name.equals("Alam")){
            Namem.setText(name);
            Bangla.setText("The world");
            Arabic.setText("شمشة");
        }
        else if(name.equals("Aahil")){
            Namem.setText(name);
            Bangla.setText("Prince");
            Arabic.setText("ششاهم");
        }
        else if(name.equals("Aalim")){
            Namem.setText(name);
            Bangla.setText("Scholar Plural is ulama normally used for religious scholors");
            Arabic.setText("ششمهة");
        }
        else if(name.equals("Aamir")){
            Namem.setText(name);
            Bangla.setText("Civilised");
            Arabic.setText("ششةهق");
        }
        else if(name.equals("Aaqib")){
            Namem.setText(name);
            Bangla.setText("Follower");
            Arabic.setText("ششضهلا");
        }
        else if(name.equals("Aarib")){
            Namem.setText(name);
            Bangla.setText("Handsome");
            Arabic.setText("ششقهلا");
        }
        else if(name.equals("Aarif")){
            Namem.setText(name);
            Bangla.setText("Knowing");
            Arabic.setText("ششقهب");
        }
        else if(name.equals("Aariz")){
            Namem.setText(name);
            Bangla.setText("Leader, ruler, leader of nation");
            Arabic.setText("ششقهئ");
        }
        else if(name.equals("Aarzu")){
            Namem.setText(name);
            Bangla.setText("Wish, hope");
            Arabic.setText("ششقئع");
        }
        else if(name.equals("Baariq")){
            Namem.setText(name);
            Bangla.setText("Shining, lightning");
            Arabic.setText("لاششقهض");
        }
        else if(name.equals("Baasir")){
            Namem.setText(name);
            Bangla.setText("Seeing, wise");
            Arabic.setText("لاششسهق");
        }
        else if(name.equals("Babar")){
            Namem.setText(name);
            Bangla.setText("Tiger");
            Arabic.setText("لاشلاشق");
        }
        else if(name.equals("Badiul Alam")){
            Namem.setText(name);
            Bangla.setText("Unique in the world");
            Arabic.setText("لاشيهعم شمشة");
        }
        else if(name.equals("Badruddin")){
            Namem.setText(name);
            Bangla.setText("Full moon of religion");
            Arabic.setText("لاشيعييهى");
        }
        else if(name.equals("Barkat")){
            Namem.setText(name);
            Bangla.setText("Blessing");
            Arabic.setText("لاشقنشف");
        }
        else if(name.equals("Baseem")){
            Namem.setText(name);
            Bangla.setText("Sagacious");
            Arabic.setText("لاشسثثة");
        }
        else if(name.equals("Bayazid")){
            Namem.setText(name);
            Bangla.setText("Name of a saint");
            Arabic.setText("لاشغشئهي");
        }
        else if(name.equals("Changeez")){
            Namem.setText(name);
            Bangla.setText("Chengiz Khan");
            Arabic.setText("ؤاشىلثثئ");
        }
        else if(name.equals("Chinar")){
            Namem.setText(name);
            Bangla.setText("A Tree");
            Arabic.setText("ؤاهىشق");
        }
        else if(name.equals("Dawud")){
            Namem.setText(name);
            Bangla.setText("A Prophet's Name");
            Arabic.setText("يشصعي");
        }
        else if(name.equals("Dabir")){
            Namem.setText(name);
            Bangla.setText("Root, origin");
            Arabic.setText("يشلاهق");
        }
        else if(name.equals("Dastgir")){
            Namem.setText(name);
            Bangla.setText("Protector, saint");
            Arabic.setText("يشسفلهق");
        }
        else if(name.equals("Daulat")){
            Namem.setText(name);
            Bangla.setText("Wealth");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Dayyan")){
            Namem.setText(name);
            Bangla.setText("A mighty Ruler");
            Arabic.setText("يشعمشف");
        }
        else if(name.equals("Ehsaan")){
            Namem.setText(name);
            Bangla.setText("Favour");
            Arabic.setText("ثاسششى");
        }
        else if(name.equals("Emad")){
            Namem.setText(name);
            Bangla.setText("Leader");
            Arabic.setText("ثةشي");
        }
        else if(name.equals("Emran")){
            Namem.setText(name);
            Bangla.setText("Progress");
            Arabic.setText("ثةقشى");
        }
        else if(name.equals("Firyal")){
            Namem.setText(name);
            Bangla.setText("Old Arabic name");
            Arabic.setText("بهقغشم");
        }
        else if(name.equals("Forouzan")){
            Namem.setText(name);
            Bangla.setText("Shining");
            Arabic.setText("بخقخعئشى");
        }
        else if(name.equals("Fakhar")){
            Namem.setText(name);
            Bangla.setText("Honour, pride");
            Arabic.setText("بشناشق");
        }
        else if(name.equals("Falahat")){
            Namem.setText(name);
            Bangla.setText("Welfare, benefit");
            Arabic.setText("بشمشاشف");
        }
        else if(name.equals("Fanan")){
            Namem.setText(name);
            Bangla.setText("Tree branch or twig");
            Arabic.setText("بشىشى");
        }
        else if(name.equals("Gahez")){
            Namem.setText(name);
            Bangla.setText("Morning");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Ghalib")){
            Namem.setText(name);
            Bangla.setText("Conqueror");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Ghazi")){
            Namem.setText(name);
            Bangla.setText("Conqueror, hero");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Haafiz")){
            Namem.setText(name);
            Bangla.setText("Title of a man who has memorized the whole Quran");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Habib")){
            Namem.setText(name);
            Bangla.setText("Beloved, dear");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Hadad")){
            Namem.setText(name);
            Bangla.setText("Syrian god of fertility");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Hakeem")){
            Namem.setText(name);
            Bangla.setText("Wise, sage");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Hameem")){
            Namem.setText(name);
            Bangla.setText("Friend");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Hamid")){
            Namem.setText(name);
            Bangla.setText("Praiser");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Harith")){
            Namem.setText(name);
            Bangla.setText("Ploughman, cultivator");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Haseeb")){
            Namem.setText(name);
            Bangla.setText(" esteemed");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Ibrahim")){
            Namem.setText(name);
            Bangla.setText("Kind father");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Iftikhar")){
            Namem.setText(name);
            Bangla.setText("Honour, grace");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Ihtisham")){
            Namem.setText(name);
            Bangla.setText("Modesty, decency");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Imaad")){
            Namem.setText(name);
            Bangla.setText("Pillar");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Imam")){
            Namem.setText(name);
            Bangla.setText("One who leads communal prayer");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Imran")){
            Namem.setText(name);
            Bangla.setText("Long lived");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Jaban")){
            Namem.setText(name);
            Bangla.setText("Soft hearted");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Jabir")){
            Namem.setText(name);
            Bangla.setText("Consoler, restorer");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Jaheer")){
            Namem.setText(name);
            Bangla.setText("Handsome man");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Jahid")){
            Namem.setText(name);
            Bangla.setText("Diligent, hardworking, striving");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Jamil")){
            Namem.setText(name);
            Bangla.setText("Beautiful");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Jamshed")){
            Namem.setText(name);
            Bangla.setText("The sun in Pisces");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Kabir")){
            Namem.setText(name);
            Bangla.setText("Great");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Kadar")){
            Namem.setText(name);
            Bangla.setText("Powerful");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Kahil")){
            Namem.setText(name);
            Bangla.setText("Friend,lover");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Kaif")){
            Namem.setText(name);
            Bangla.setText("State, condition");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Kaiser")){
            Namem.setText(name);
            Bangla.setText("Emperor, King");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Kalam")){
            Namem.setText(name);
            Bangla.setText("Speech,conversation");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Kamran")){
            Namem.setText(name);
            Bangla.setText("Lucky, happy");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Labib")){
            Namem.setText(name);
            Bangla.setText("Intelligent");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Latif")){
            Namem.setText(name);
            Bangla.setText("Kind, gracious");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Lutfur")){
            Namem.setText(name);
            Bangla.setText("Favour of the All-merciful");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Laraib")){
            Namem.setText(name);
            Bangla.setText("Faultless, pure");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Liaquat")){
            Namem.setText(name);
            Bangla.setText("Decorum, decency");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Liban")){
            Namem.setText(name);
            Bangla.setText("Succesfull, charmed");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Mamun")){
            Namem.setText(name);
            Bangla.setText("Trustworthy, reliable");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Maahir")){
            Namem.setText(name);
            Bangla.setText("Skillful, able");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Mahad")){
            Namem.setText(name);
            Bangla.setText("Great, nice");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Mifzal")){
            Namem.setText(name);
            Bangla.setText("Great and blessed person");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Meerab")){
            Namem.setText(name);
            Bangla.setText("Paradise Flower");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Miraj")){
            Namem.setText(name);
            Bangla.setText("Place of ascent");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Misbah")){
            Namem.setText(name);
            Bangla.setText("Lamp, lantern");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Nadir")){
            Namem.setText(name);
            Bangla.setText("Dear, Rare");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Nabeel")){
            Namem.setText(name);
            Bangla.setText("Handsome, intelligint");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Nadim")){
            Namem.setText(name);
            Bangla.setText("Friend, companion");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Nayeem")){
            Namem.setText(name);
            Bangla.setText("Happiness, comfort");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Nafis")){
            Namem.setText(name);
            Bangla.setText("Precious");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Nahyan")){
            Namem.setText(name);
            Bangla.setText("Stopper");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Omeed")){
            Namem.setText(name);
            Bangla.setText("Hope");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Omar")){
            Namem.setText(name);
            Bangla.setText("Long-Lived");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Obayed")){
            Namem.setText(name);
            Bangla.setText("Small Slave");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Parvez")){
            Namem.setText(name);
            Bangla.setText("Success. Name of a Persian King");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Pamir")){
            Namem.setText(name);
            Bangla.setText("Helper, constant perfect");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Pasha")){
            Namem.setText(name);
            Bangla.setText("Lord, honorific title");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Qader")){
            Namem.setText(name);
            Bangla.setText("Powerful");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Qabeel")){
            Namem.setText(name);
            Bangla.setText("Famous son of Adam");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Qaanit")){
            Namem.setText(name);
            Bangla.setText("Satisfied,contented");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Raafe")){
            Namem.setText(name);
            Bangla.setText("A companion");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Raahil")){
            Namem.setText(name);
            Bangla.setText("Path guider");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Raashid")){
            Namem.setText(name);
            Bangla.setText("Major, Adult");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Raem")){
            Namem.setText(name);
            Bangla.setText("One who has a desire and searches");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Rafan")){
            Namem.setText(name);
            Bangla.setText("Beautiful, graceful");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Raghib")){
            Namem.setText(name);
            Bangla.setText("Willing, desirous");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Rahat")){
            Namem.setText(name);
            Bangla.setText("Rest, Repose");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Rajeel")){
            Namem.setText(name);
            Bangla.setText("One who walks too much");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Saad")){
            Namem.setText(name);
            Bangla.setText("Good luck");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Saadat")){
            Namem.setText(name);
            Bangla.setText("Prosperity, happiness");
            Arabic.setText("شلاشى");
        }

        else if(name.equals("Saafi")){
            Namem.setText(name);
            Bangla.setText("Pure, clear");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Saamir")){
            Namem.setText(name);
            Bangla.setText("Fruit-bearing");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Saaqib")){
            Namem.setText(name);
            Bangla.setText("Star");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Sabeer")){
            Namem.setText(name);
            Bangla.setText("Patient");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Sabit")){
            Namem.setText(name);
            Bangla.setText("Strong, well-established");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Shadab")){
            Namem.setText(name);
            Bangla.setText("Fresh, evergreen");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Siham")){
            Namem.setText(name);
            Bangla.setText("Arrows; pl. of Sahm");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Sohrab")){
            Namem.setText(name);
            Bangla.setText("Champion");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Taahid")){
            Namem.setText(name);
            Bangla.setText("To console, to guard");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Tahmid")){
            Namem.setText(name);
            Bangla.setText("Praising Allah");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Tahsin")){
            Namem.setText(name);
            Bangla.setText("Adornment");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Talab")){
            Namem.setText(name);
            Bangla.setText("Demand");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Tawqir")){
            Namem.setText(name);
            Bangla.setText("Honour, great respect");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Tawseef")){
            Namem.setText(name);
            Bangla.setText("Praise");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Toymur")){
            Namem.setText(name);
            Bangla.setText("Brave strong");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Taysir")){
            Namem.setText(name);
            Bangla.setText("Facilitation");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Turhan")){
            Namem.setText(name);
            Bangla.setText("Of mercy");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Uhban")){
            Namem.setText(name);
            Bangla.setText("Ibn Aws al-Aslani RA");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Ulfat")){
            Namem.setText(name);
            Bangla.setText("Love, affection");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Usman")){
            Namem.setText(name);
            Bangla.setText("The young of a lark");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Wahab")){
            Namem.setText(name);
            Bangla.setText("Giving");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("wahid")){
            Namem.setText(name);
            Bangla.setText("One, unique");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Waleed")){
            Namem.setText(name);
            Bangla.setText("Newborn Child");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Waqar")){
            Namem.setText(name);
            Bangla.setText("Majesty");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Yaamin")){
            Namem.setText(name);
            Bangla.setText("Blessed, auspicious");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Yusuf")){
            Namem.setText(name);
            Bangla.setText("A Prophet");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Yasin")){
            Namem.setText(name);
            Bangla.setText("The opening letters of the first verse of surat Ya Sin");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Yasir")){
            Namem.setText(name);
            Bangla.setText("Easy, wealthy");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Zaakir")){
            Namem.setText(name);
            Bangla.setText("Rememberer of Allah");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Zabir")){
            Namem.setText(name);
            Bangla.setText("The person who have Religious Knowledge");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Zubair")){
            Namem.setText(name);
            Bangla.setText("Strong, powerful, smart");
            Arabic.setText("شلاشى");
        }
        else if(name.equals("Zohaib")){
            Namem.setText(name);
            Bangla.setText("Golden");
            Arabic.setText("شلاشى");
        }






    }
}
