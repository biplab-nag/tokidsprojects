package com.apps.finalversion.tokidprojects.fragments.name;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.apps.finalversion.tokidprojects.R;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class NameGirlsFragment extends Fragment {


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
    public NameGirlsFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_name_girls, container, false);

        editSearch2 = (ListView)view.findViewById(R.id.editSearch2);
        editText2 = (EditText)view.findViewById(R.id.editText2);

        adapter = new ArrayAdapter<String>(getContext(), R.layout.list_item,R.id.textView,data);
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
                                getActivity(), R.layout.list_item,R.id.textView, patternList(charA, charB));
                    } else {
                        adapter = new ArrayAdapter<>(
                                getActivity(), R.layout.list_item,R.id.textView, filterList(charSequence));
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

                Intent intent = new Intent(getContext(),GirlsDetails.class);

                intent.putExtra("Name",selectedItem);
                startActivity(intent);
            }
        });




        return  view;
    }

    private List<String> filterList(CharSequence query) {
        List<String> queryResult = new ArrayList<>(2);
        for (String name: data){
            if (name.toLowerCase().startsWith(query.toString().toLowerCase())){
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
                Toast.makeText(getContext(), item, Toast.LENGTH_SHORT).show();
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    };

}
