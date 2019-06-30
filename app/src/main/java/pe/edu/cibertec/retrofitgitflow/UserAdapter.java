package pe.edu.cibertec.retrofitgitflow;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

  private List<Post> posts;

  public UserAdapter(List<Post> posts){
      this.posts =posts;
  }

    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_view,parent,false);
        ViewHolder viewHolder =new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(UserAdapter.ViewHolder holder, int position) {
        String name = posts.get(position).getTitle();
        holder.name.setText(name);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        public ViewHolder(View view){

            super(view);
            name = (TextView) view.findViewById(R.id.textViewResult);

        }

    }

}
