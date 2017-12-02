package tugasketiga.ej.com.tugasketiga;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    Context context = this;

    RecyclerView rvSiswa;
    List<Siswa> siswaList;
    SiswaAdapter siswaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        siswaList =  new ArrayList<>();
        siswaList.add(new Siswa("Muhamad Sirojudin","XII RPL 1"));
        siswaList.add(new Siswa("Anwar Sanusi","XII RPL 1"));
        siswaList.add(new Siswa("Dinda Ayu Syafitri","XII RPL 1"));
        siswaList.add(new Siswa("Ahmad Muhyidin","XII RPL 2"));
        siswaList.add(new Siswa("Muhamad Kelpin Hidayat","XII RPL 2"));

        siswaList.add(new Siswa("Umar Rosidin","XII RPL 2"));
        siswaList.add(new Siswa("Denis Yuanita","XII RPL 1"));
        siswaList.add(new Siswa("Ramadhan","XII RPL 1"));
        siswaList.add(new Siswa("Muhamad Dava Setiawan","XII RPL 2"));
        siswaList.add(new Siswa("Yasinta Solihat","XII RPL 1"));

        siswaList.add(new Siswa("Muhamad Sirojudin","XII RPL 1"));
        siswaList.add(new Siswa("Anwar Sanusi","XII RPL 1"));
        siswaList.add(new Siswa("Dinda Ayu Syafitri","XII RPL 1"));
        siswaList.add(new Siswa("Ahmad Muhyidin","XII RPL 2"));
        siswaList.add(new Siswa("Muhamad Kelpin Hidayat","XII RPL 2"));


        siswaList.add(new Siswa("Umar Rosidin","XII RPL 2"));
        siswaList.add(new Siswa("Denis Yuanita","XII RPL 1"));
        siswaList.add(new Siswa("Ramadhan","XII RPL 1"));
        siswaList.add(new Siswa("Muhamad Dava Setiawan","XII RPL 2"));
        siswaList.add(new Siswa("Yasinta Solihat","XII RPL 1"));


        siswaList.add(new Siswa("Muhamad Sirojudin","XII RPL 1"));
        siswaList.add(new Siswa("Anwar Sanusi","XII RPL 1"));
        siswaList.add(new Siswa("Dinda Ayu Syafitri","XII RPL 1"));
        siswaList.add(new Siswa("Ahmad Muhyidin","XII RPL 2"));
        siswaList.add(new Siswa("Muhamad Kelpin Hidayat","XII RPL 2"));


        siswaList.add(new Siswa("Umar Rosidin","XII RPL 2"));
        siswaList.add(new Siswa("Denis Yuanita","XII RPL 1"));
        siswaList.add(new Siswa("Ramadhan","XII RPL 1"));
        siswaList.add(new Siswa("Muhamad Dava Setiawan","XII RPL 2"));
        siswaList.add(new Siswa("Yasinta Solihat","XII RPL 1"));

        siswaAdapter = new SiswaAdapter(context);
        siswaAdapter.setItem(siswaList);

        rvSiswa = findViewById(R.id.rv_siswa);

        rvSiswa.setLayoutManager(new LinearLayoutManager(context));
        rvSiswa.setAdapter(siswaAdapter);
    }
}
