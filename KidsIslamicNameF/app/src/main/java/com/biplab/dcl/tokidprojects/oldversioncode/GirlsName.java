package com.biplab.dcl.tokidprojects.oldversioncode;

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

import com.biplab.dcl.tokidprojects.R;
import com.biplab.dcl.tokidprojects.fragments.name.GirlsDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GirlsName extends AppCompatActivity {

    private EditText editText2;
    private ListView editSearch2;

    private ArrayAdapter<String> adapter;

    String data[] = new String[]{

            "Ayesha", "Aafreen", "Aaida", "Aakifa", "Amina", "Aamira","Aanisa","Aasfa","Beena", "Bilqis","Bushra ","Begum",
            "Champa", "Chandni","Chasheen", "Deeba","Dilara","Dilruba","Diya", "Eira", "Eliza","Erina","Eva","Fariha","Fahmida","Fahima",
            "Faiza","Farhana", "Ghaliba","Gulshan","Gulzaar", "Hasna", "Habiba", "Hafsa","Humaira","Iffat-Ara", "Isa","Israt Jahan","Ismat-Ara",
            "Jannatul Ferdous", "Jahan", "Jahida", "Jasmin","Jawda","Johara","Juhi","Kaneez","Kariman","Kasturi","Khadija","Khushbu",
            "Labiba", "Laila","Lamia","Lamisa","Leena","Liza","Lubaba","Liyana",
            "Maliha", "Maisha", "Maahnoor","Maha","Mahbooba", "Naila","Naazneen",
            "Nabila", "Nafisa", "Nilofar","Nusrat", "Obaidiya", "Orzala", " Parveen","Pakiza",
            "Qaifa","Raha","Raisa","Rihana","Rubaiya","Reshma","Rubina","Rahela",
            "Saadia", "Saara","Sabeera","Sabiha","Sabrina","Safa","Sitara","Tasnim","Tanzila","Tuba","Tisha",
            "Tahmina","Umaiza","Unaiza","Urshia","Varisha","Wabisa","Wasfiya","Yesmin","Zaara","Zerin","Zeenat"
    };
    String vname[] = new String[]{

            "Ayesha", "Aafreen", "Aaida", "Aakifa", "Amina", "Aamira","Aanisa","Aasfa","Beena", "Bilqis","Bushra ","Begum",
            "Champa", "Chandni","Chasheen", "Deeba","Dilara","Dilruba","Diya", "Eira", "Eliza","Erina","Eva","Fariha","Fahmida","Fahima",
            "Faiza","Farhana", "Ghaliba","Gulshan","Gulzaar", "Hasna", "Habiba", "Hafsa","Humaira","Iffat-Ara", "Isa","Israt Jahan","Ismat-Ara",
            "Jannatul Ferdous", "Jahan", "Jahida", "Jasmin","Jawda","Johara","Juhi","Kaneez","Kariman","Kasturi","Khadija","Khushbu",
            "Labiba", "Laila","Lamia","Lamisa","Leena","Liza","Lubaba","Liyana",
            "Maliha", "Maisha", "Maahnoor","Maha","Mahbooba", "Naila","Naazneen",
            "Nabila", "Nafisa", "Nilofar","Nusrat", "Obaidiya", "Orzala", " Parveen","Pakiza",
            "Qaifa","Raha","Raisa","Rihana","Rubaiya","Reshma","Rubina","Rahela",
            "Saadia", "Saara","Sabeera","Sabiha","Sabrina","Safa","Sitara","Tasnim","Tanzila","Tuba","Tisha",
            "Tahmina","Umaiza","Unaiza","Urshia","Varisha","Wabisa","Wasfiya","Yesmin","Zaara","Zerin","Zeenat"
    };
   /* String bangla[] = new String[]{
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
            "Dear, beloved sweetheart","Acquirer, obtainer","Beautiful","Noble, highborn","Refined, pure","Waterlily","Bondswoman of Allah","Brightness of Fire",
            "Very Noble","Pure, chaste, polite","Estimater","Peaceful","Chief, leader","Sweet basil","Spring season",
            "Golden Silk, Expensive","Face reader","One who travels",
            "Lucky", "Wife of the Prophet Ibrahim and mother of the Prophet Ismail",
            "Patient, tolerant","Coming or arriving in the morning","Princess, daughter of the king",
            "A hill near the sacred Kaaba; stone, rock","veil, screen, curtain"," Fountain of paridise.",
            "Revelation, sending down","The name of a tree in heaven","One who is active, lively",
            "Clever","Bright, beautiful and soft hearted","Sheep/Goat, Name of a Valley between Makkah and Taif",
            "One who belongs in the skies"," Lightning","Something Bright","Depictive","Confident, sure, certain",
            "A beautiful flower that shines","Beautiful Flower","Just like Gold","Adornment, ornament, decoration, elegance, beauty"

    }; */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls_name);

        editSearch2 = (ListView)findViewById(R.id.editSearch2);
        editText2 = (EditText)findViewById(R.id.editText2);

        adapter = new ArrayAdapter<String>(this, R.layout.list_item,R.id.textView,data);
        editSearch2.setAdapter(adapter);

        editText2.addTextChangedListener(new TextWatcher() {
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
                                GirlsName.this, R.layout.list_item,R.id.textView, patternList(charA, charB));
                    } else {
                        adapter = new ArrayAdapter<>(
                                GirlsName.this, R.layout.list_item,R.id.textView, filterList(charSequence));
                    }
                    adapter.notifyDataSetChanged();
                    editSearch2.setAdapter(adapter);
                } catch (Exception e){
                    Log.e("TextChangedException", e.getMessage());
                }
            }

            @Override
            public void afterTextChanged(Editable charSequence) {

            }
        });
        // Set an item click listener for ListView
        editSearch2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected item text from ListView
                String selectedItem = (String) parent.getItemAtPosition(position);

                Intent intent = new Intent(GirlsName.this,GirlsDetails.class);

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
                Toast.makeText(GirlsName.this, item, Toast.LENGTH_SHORT).show();
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    };
}
