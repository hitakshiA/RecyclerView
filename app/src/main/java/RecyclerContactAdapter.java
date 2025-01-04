import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Contact_model;
import com.example.recyclerview.R;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.viewholder> {
    Context context;
     ArrayList<Contact_model> arrcontacts;


   RecyclerContactAdapter(Context context, ArrayList<Contact_model> arrcontacts){
  this.context = context;
  this.arrcontacts= arrcontacts;
   }


    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_contact_row,parent,false);
    //Ye attach to root isliye false kra bcoz jo first view hai use fix krdia toh recycler view ka  use hi kya hai  so false it taki scroll kre toh upar wala haate
    viewholder viewHolder = new viewholder(view);
       return viewHolder;
    }
    //here many times we have to do alt+Enter so watch video from 17hrs 16 min
    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
    //Dataset m se jonsi index ke liye data chahiye whi ayega like 0th index ki image hai toh vo hi ayegi tthis is for position
       holder.imgcontact.setImageResource(arrcontacts.get(position).img);
       holder.Contact.setText(arrcontacts.get(position).name);
       holder.ContactNumber.setText(arrcontacts.get(position).number);

    }

    @Override
    public int getItemCount() {


        return arrcontacts.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
       TextView Contact , ContactNumber;
       ImageView imgcontact;

      public viewholder(@NonNull View itemView){
          super(itemView);

          Contact  = itemView.findViewById(R.id.Contact);
          ContactNumber = itemView.findViewById(R.id.ContactNumber);
          imgcontact = itemView.findViewById(R.id.imgContact);
      }
 }

//Listview m hamare pr  defualt adapter tha aur yha pr hamne pura adapter khud banaya hai recyclerContact Adapater.java m



}
