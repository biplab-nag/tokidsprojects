package com.apps.finalversion.tokidprojects.oldversioncode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.apps.finalversion.tokidprojects.fragments.name.BoyesNameDetails;
import com.apps.finalversion.tokidprojects.R;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BoysName extends AppCompatActivity {

    private EditText editText;
    private ListView editSearch;


    private ArrayAdapter<String> adapter;

    String data[] = new String[]{

            "Aban", "Abdar", "Abis", "Adhil", " Alam ", "Aahil", "Aalim","Aamir", "Aaqib", "Aarib", "Aarif", "Aariz", "Aarzu",
            "Baariq", "Baasir", "Babar", "Badiul Alam", " Badruddin", "Barkat","Baseem", "Bayazid", "Changeez", "Chinar", "Dawud", "Dabir",
            "Dastgir", "Daulat", "Dayyan", "Ehsaan", "Ejaz", "Emad", "Emran","Firyal", "Forouzan", "Fakhar", "Falahat",
            "Fanan", "Gahez","Ghalib","Ghazi","Haafiz","Habib","Hadad","Hakeem","Hameem","Hamid",
            "Harith","Haseeb","Ibrahim","Iftikhar","Ihtisham","Imaad","Imam","Imran",
            "Jaban","Jabir","Jaheer","Jahid","Jamil","Jamshed","Kabir","Kadar","Kahil","Kaif","Kaiser","Kalam",
            "Kamran","Labib","Latif","Lutfur","Laraib","Liaquat","Liban","Mamun"," Maahir","Mahad","Mifzal",
            "Meerab","Miraj","Misbah","Naadir","Nabeel","Nadim","Naeem","Nafis","Nahyan","Omeed","Omar","Obayed",
            "Parvez","Pamir","Pasha","Qader","Qabeel","Qaanit","Raafe","Raahil","Raashid","Raem","Rafan","Raghib",
            "Rahat","Rajeel",
            "Saad","Saadat","Saafi","Saamir","Saaqib","Sabeer","Sabit","Shadab","Siham","Sohrab","Taahid",
            "Tahmid","Tahsin","Talab","Tawqir","Tawseef", " Toymur","Taysir","Turhan","Uhban","Ulfat","Usman","Wahab","Wahid","Waleed","Waqar",
            "Yaamin","Yusuf","Yasin","Yasir","Zaakir","Zabir","Zubair","Zohaib"
    };

    String vname[] = new String[]{
            "Aban", "Abdar", "Abis", "Adhil", " Alam ", "Aahil", "Aalim","Aamir", "Aaqib", "Aarib", "Aarif", "Aariz", "Aarzu",
            "Baariq", "Baasir", "Babar", "Badiul Alam", "Badruddin", "Barkat","Baseem", "Bayazid", "Changeez", "Chinar", "Dawud", "Dabir",
            "Dastgir", "Daulat", "Dayyan", "Ehsaan", "Ejaz", "Emad", "Emran","Firyal", "Forouzan", "Fakhar", "Falahat",
            "Fanan", "Gahez","Ghalib","Ghazi","Haafiz","Habib","Hadad","Hakeem","Hameem","Hamid",
            "Harith","Haseeb","Ibrahim","Iftikhar","Ihtisham","Imaad","Imam","Imran",
            "Jaban","Jabir","Jaheer","Jahid","Jamil","Jamshed","Kabir","Kadar","Kahil","Kaif","Kaiser","Kalam",
            "Kamran","Labib","Latif","Lutfur","Laraib","Liaquat","Liban","Mamun"," Maahir","Mahad","Mifzal",
            "Meerab","Miraj","Misbah","Naadir","Nabeel","Nadim","Naeem","Nafis","Nahyan","Omeed","Omar","Obayed",
            "Parvez","Pamir","Pasha","Qader","Qabeel","Qaanit","Raafe","Raahil","Raashid","Raem","Rafan","Raghib",
            "Rahat","Rajeel",
            "Saad","Saadat","Saafi","Saamir","Saaqib","Sabeer","Sabit","Shadab","Siham","Sohrab","Taahid",
            "Tahmid","Tahsin","Talab","Tawqir","Tawseef","Toymur","Taysir","Turhan","Uhban","Ulfat",
            "Usman","Wahab","Wahid","Waleed","Waqar",
            "Yaamin","Yusuf","Yasin","Yasir","Zaakir","Zabir","Zubair","Zohaib"
    };

  /*  String bangla[] = new String[]{
            "angel of iron", "Bright, like glass", "Lucky", "Honorable Judge", "The world", "Prince",
            "Scholar Plural is ulama normally used for religious scholors","Civilised", "Follower", "Handsome",
             "Knowing", "Leader, ruler, leader of nation", "Wish, hope",
            "Shining, lightning", "Seeing, wise", "Tiger", "Unique in the world", "Full moon of religion",
            "Blessing","Sagacious", "Smiling","Name of a saint", "Chengiz Khan", "A Tree", "A Prophet's Name", "Root, origin",
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
            "Star","Patient","Strong, well-established","Fresh, evergreen","Arrows; pl. of Sahm"," Champion",
            "To console, to guard","Praising Allah","Adornment","Demand","Honour, great respect","Praise",
            "Brave strong","Facilitation","Of mercy","Ibn Aws al-Aslani RA,","Love, affection","The young of a lark",
            "Giving","One, unique","Newborn Child",
            "Majesty","Blessed, auspicious","A Prophet", "The opening letters of the first verse of surat Ya Sin ",
            "Easy, wealthy","Rememberer of Allah","The person who have Religious Knowledge","Strong, powerful, smart","Golden"
    }; */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boys_name);

        editSearch = (ListView)findViewById(R.id.editSearch);
        editText = (EditText)findViewById(R.id.editText);

        adapter = new ArrayAdapter<String>(this, R.layout.list_item,R.id.textView,data);
        editSearch.setAdapter(adapter);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                try {
                    if (charSequence.toString().contains("*")){
                        String [] chars =  charSequence.toString().split("\\*");
                        String charA = chars[0];
                        String charB = chars[1];
                        adapter = new ArrayAdapter<>(
                                BoysName.this, R.layout.list_item,R.id.textView, patternList(charA, charB));
                    } else {
                        adapter = new ArrayAdapter<>(
                                BoysName.this, R.layout.list_item,R.id.textView, filterList(charSequence));
                    }
                    adapter.notifyDataSetChanged();
                    editSearch.setAdapter(adapter);
                } catch (Exception e){
                    Log.e("TextChangedException", e.getMessage());
                }
            }

            @Override
            public void afterTextChanged(Editable charSequence) {

            }
        });

        // Set an item click listener for ListView
        editSearch.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected item text from ListView
                String selectedItem = (String) parent.getItemAtPosition(position);

                Intent intent = new Intent(BoysName.this,BoyesNameDetails.class);

                intent.putExtra("Name",selectedItem);

                startActivity(intent);
            }

        });


    }

    private List<String> filterList(CharSequence query) {
        List<String> queryResult = new ArrayList<>(2);
        for (String name: data){
            if (name.toLowerCase().contains(query.toString().toLowerCase())){
                queryResult.add(name);
            }
        }
        return queryResult;
    }
    private List<String> patternList(String startString, String endString){

        String expression = String.format(
                "(?i)^(?!%s%s$)%s.*%s$",
                startString.toLowerCase(),
                endString.toLowerCase(),
                startString.toLowerCase(),
                endString.toLowerCase()
        );

        Pattern p = Pattern.compile(expression);
        List<String> patternResult = new ArrayList<>(2);
        for (String name: data){
            Matcher m = p.matcher(name.toLowerCase());
            if(m.find()) {
                patternResult.add(name);
            }
        }
        return patternResult;
    }

    private ListView.OnItemClickListener onItemClickListener
            = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            try {
                String item =  vname[i];
                Toast.makeText(BoysName.this, item, Toast.LENGTH_SHORT).show();
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    };

}