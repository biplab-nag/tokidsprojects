package com.biplab.dcl.tokidprojects.fragments.name;


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

import com.biplab.dcl.tokidprojects.R;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A simple {@link Fragment} subclass.
 */
public class NameBoyFragment extends Fragment {

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


    public NameBoyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_name_boy, container, false);


        editSearch = (ListView)view.findViewById(R.id.editSearch);
        editText = (EditText)view.findViewById(R.id.editText);


        adapter = new ArrayAdapter<String>(getContext(), R.layout.list_item,R.id.textView,data);
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
                                getActivity(), R.layout.list_item,R.id.textView, patternList(charA, charB));
                    } else {
                        adapter = new ArrayAdapter<>(
                                getActivity(), R.layout.list_item,R.id.textView, filterList(charSequence));
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

                Intent intent = new Intent(getContext(),BoyesNameDetails.class);
                intent.putExtra("Name",selectedItem);
                startActivity(intent);
            }

        });




        return  view;
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
                Toast.makeText(getContext(), item, Toast.LENGTH_SHORT).show();
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    };

}
