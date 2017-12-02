package tugasketiga.ej.com.tugasketiga;

/**
 * Created by EJ Public on 29/11/2017.
 */

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class SiswaAdapter extends RecyclerView.Adapter<SiswaAdapter.ViewHoder>{

    private List<Siswa> siswaList;

    private Context context;

    //Fragment Manager
    private static FragmentManager fragmentManager;

    public SiswaAdapter(Context context){
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setItem(List<Siswa> newSiswa){
        this.siswaList = newSiswa;
    }

    @Override
    public ViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.item_siswa, parent,false);

        ViewHoder siswaVh = new ViewHoder(view);
        return siswaVh;
    }

    @Override
    public void onBindViewHolder(final ViewHoder holder, int position) {
        final Siswa newSiswa = siswaList.get(position) ;

        TextView namaSiswa = holder.namaSiswa;
        TextView kelasJurusan = holder.kelasJurusan;

        namaSiswa.setText(newSiswa.getNamaSiswa());
        kelasJurusan.setText(newSiswa.getKelasJurusan());

        //Clickable
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), newSiswa.getNamaSiswa(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return siswaList.size();
    }

    public static class ViewHoder extends RecyclerView.ViewHolder {

        public TextView namaSiswa;
        public TextView kelasJurusan;

        public ViewHoder(View itemView) {
            super(itemView);
            namaSiswa = itemView.findViewById(R.id.tv_nama_siswa);
            kelasJurusan = itemView.findViewById(R.id.tv_kelas_jurusan);
        }
    }
}
