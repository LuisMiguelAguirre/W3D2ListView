package com.example.admin.w3d2listview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Luis Aguirre on 9/6/2017.
 */

public class AnimalListViewAdapter extends ArrayAdapter<Animal> {

    public AnimalListViewAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Animal> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Animal animal = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(animal.getLayout(), null);
        }

        ViewHolderAnimal viewHolderAnimal = new ViewHolderAnimal();
        viewHolderAnimal.imageViewPicture = convertView.findViewById(R.id.image_view_picture);
        viewHolderAnimal.textViewName = convertView.findViewById(R.id.text_view_name);
        viewHolderAnimal.textViewDescription = convertView.findViewById(R.id.text_view_description);

        viewHolderAnimal.imageViewPicture.setImageResource(animal.getImageId());
        viewHolderAnimal.textViewName.setText(animal.getName());
        viewHolderAnimal.textViewDescription.setText(animal.getDescription());

        convertView.setTag(viewHolderAnimal);

        return convertView;
    }

    class ViewHolderAnimal {
        ImageView imageViewPicture;
        TextView textViewName;
        TextView textViewDescription;
    }
}
