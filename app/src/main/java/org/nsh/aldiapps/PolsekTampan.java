package org.nsh.aldiapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PolsekTampan extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listAct = new String[] {"Call Center","SMS Center","Driving Direction","Website","Info di Google","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAct));
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
            if (pilihan.equals("Call Center")){
                String nomortel ="tel:+6276164110";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            } else if (pilihan.equals("SMS Center")){
                String smsText = "Aldiansyah Pramudia Hasibuan/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:+6276164110"));
                a.putExtra("sms_body",smsText);

            } else if (pilihan.equals("Driving Direction")){
                String lokasirs = "google.navigation:q=0.46512,101.38794";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));

            } else if (pilihan.equals("Website")) {
                String website = "https://www.liputan6.com/tag/polsek-tampan";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));

            } else if (pilihan.equals("Info di Google")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Polsek Tampan");

            } else if (pilihan.equals("Exit")) {
                a = new Intent(this,MainActivity.class);
            }

            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
