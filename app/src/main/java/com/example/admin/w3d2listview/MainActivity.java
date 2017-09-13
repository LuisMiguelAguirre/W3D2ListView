package com.example.admin.w3d2listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Animal> animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeAnimalArray();

        ListView listViewAnimal = (ListView) findViewById(R.id.list_view_animals);
        AnimalListViewAdapter animalListViewAdapter = new AnimalListViewAdapter(this, R.layout.activity_animal_wild, animals);
        listViewAnimal.setAdapter(animalListViewAdapter);


    }

    private void initializeAnimalArray() {
        animals = new ArrayList<Animal>();
        animals.add(new Animal("Aligator", R.drawable.aligator, "A large semiaquatic reptile similar to a crocodile but with a broader and shorter head, native to the Americas and China.", R.layout.activity_animal_wild));
        animals.add(new Animal("Beard", R.drawable.bear, "a large, heavy, mammal that walks on the soles of its feet, with thick fur and a very short tail. Bears are related to the dog family, but most species are omnivorous.", R.layout.activity_animal_domestic));
        animals.add(new Animal("Bird", R.drawable.bird, "a warm-blooded egg-laying vertebrate distinguished by the possession of feathers, wings, and a beak and (typically) by being able to fly.", R.layout.activity_animal_bird));
        animals.add(new Animal("Chipmunk", R.drawable.chipmunk, "a burrowing ground squirrel with cheek pouches and light and dark stripes running down the body, found in North America and northern Eurasia.", R.layout.activity_animal_bird));
        animals.add(new Animal("Dog", R.drawable.dog, "a domesticated carnivorous mammal that typically has a long snout, an acute sense of smell, and a barking, howling, or whining voice. It is widely kept as a pet or for work or field sports.", R.layout.activity_animal_bird));
        animals.add(new Animal("Dove", R.drawable.dove, "a stocky seed- or fruit-eating bird with a small head, short legs, and a cooing voice. Doves are generally smaller and more delicate than pigeons, but many kinds have been given both names.", R.layout.activity_animal_bird));
        animals.add(new Animal("Eagle", R.drawable.eagle, "a large bird of prey with a massive hooked bill and long broad wings, renowned for its keen sight and powerful soaring flight.", R.layout.activity_animal_bird));
        animals.add(new Animal("Giraffe", R.drawable.giraffe, "a large African mammal with a very long neck and forelegs, having a coat patterned with brown patches separated by lighter lines. It is the tallest living animal.", R.layout.activity_animal_bird));
        animals.add(new Animal("Horse", R.drawable.horse, "a solid-hoofed plant-eating domesticated mammal with a flowing mane and tail, used for riding, racing, and to carry and pull loads.", R.layout.activity_animal_bird));
        animals.add(new Animal("Iguana", R.drawable.iguana, "a large, arboreal, tropical American lizard with a spiny crest along the back and greenish coloration, occasionally kept as a pet.", R.layout.activity_animal_bird));
        animals.add(new Animal("Lizard", R.drawable.lizard, "a reptile that typically has a long body and tail, four legs, movable eyelids, and a rough, scaly, or spiny skin.", R.layout.activity_animal_bird));
        animals.add(new Animal("Pigeon", R.drawable.pigeon, "a stout seed- or fruit-eating bird with a small head, short legs, and a cooing voice, typically having gray and white plumage.", R.layout.activity_animal_bird));
        animals.add(new Animal("Shark", R.drawable.shark, "a long-bodied chiefly marine fish with a cartilaginous skeleton, a prominent dorsal fin, and toothlike scales. Most sharks are predatory, although the largest kinds feed on plankton.", R.layout.activity_animal_bird));
        animals.add(new Animal("Snake", R.drawable.snake, "a long limbless reptile that has no eyelids, a short tail, and jaws that are capable of considerable extension. Some snakes have a venomous bite.", R.layout.activity_animal_bird));
        animals.add(new Animal("Squirrel", R.drawable.squirrel, "an agile tree-dwelling rodent with a bushy tail, typically feeding on nuts and seeds.", R.layout.activity_animal_bird));

    }
}
