package org.nsh.aldiapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class School extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listSchool = new String[] {"SDN 094 Pekanbaru","SMPN 8 Pekanbaru","SMAN 12 Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listSchool));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("SDN 094 Pekanbaru")){
                a = new Intent(this,SDN.class);

            } else if (pilihan.equals("SMPN 8 Pekanbaru")){
                a = new Intent(this,SMP.class);

            } else if (pilihan.equals("SMAN 12 Pekanbaru")) {
                a = new Intent(this,SMA.class);

            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
