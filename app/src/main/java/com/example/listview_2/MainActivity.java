package com.example.listview_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter adapter;
    ListView lst;
    String temple[]={"Sun Temple","Somnath Temple","Kedarnath Temple","Ramanathaswamy Temple","Vaishno-Devi Temple",
    "Kashi Vishwanath Temple","Sri-Jagannath Temple","Meenakshi Temple","Amarnath Cave Temple","Lingaraja Temple","Tirupati Balaji Temple",
    "Kanchipuram Temples","Virupaksha Temple","Akshardham Temple","Shri Padmanabhaswamy Temple"};

    String descriptions[]={"The Sun temple is situated in the small town of Konark situated in the Puri district of Odisha. This marvel of architecture is dedicated to Indian God of Sun, Surya. The temple was built in the 13th century by a king called Narasimhadeva. There is an ancient legend attached to this temple, once Lord Krishna cursed one of his own sons with leprosy. To seek penance, his son, Samba worshiped Surya for twelve years.",
    "Somnath Temple is one of the oldest pilgrimage centres in India and finds mention in the ancient books of Shiv Puran, Skanda Purana and Shreemad Bhagvat Gita. Soma refers to ‘Moon God’, thus Somnath means ‘Protector of the Moon God’.\n" +
            "\n" +
            "According to a legend, the Indian God of Moon, Soma was cursed by his father-in-law to lose his lustre. It was Lord Shiva who cured his illness and later Soma built this temple in his honour. It is one of the most revered ‘jyotirlinga’ among the 12 jyotirlingas of India.\n" +
            "\n" +
            "The temple is located in Prabhas Kshetra in Saurashtra (Gujarat).",
    "Situated in the Himalayan range of Garhwal (Uttarakhand), Kedarnath temple is one of the most sacred shrines in the world. The holy abode of Shiva is believed to have been built by the Pandavas to atone for their sins during Mahabharata.\n" +
            "\n" +
            "The temple was restored by Adi Sankaracharya in the 8th century. It is one of the Chota Char Dhams of Uttarakhand and requires the pilgrims to trek a distance of 14 kms on the hilly terrain.",
    "Rameswaram is a small island town in Tamil Nadu known for being one of the pious Char Dhams of the Hindus. As per the legend, Lord Rama with his wife Sita landed on the shore of this island after defeating the demon king, Ravana who was a brahmin.\n" +
            "\n" +
            "To seek atonement for killing a brahmin, Lord Rama wanted to pray to Lord Shiva. He asked Hanuman to fly to Kailash and bring a Shivalinga. In the meantime, Goddess Sita made a small lingam. The one made by Goddess Sita is called Ramalingam and one brought by Lord Hanuman is called Vishwalingam.",
    "One of the most holy sites for Hindu pilgrims, Vaishno Devi Temple is nestled on the Trikuta mountain in Jammu & Kashmir. As per the legend, Vaishno Devi under the disguise of a young girl, Vaishnavi was being chased by a black magician, Bhairo Nath.\n" +
            "\n" +
            "He was pestering her to marry him. In order to escape him, she fled to the mountains but he followed her there too. After stopping at present day Banganga, Charan Paduka and Adkwari, the Goddess finally reached the holy shrine. When Bhairo Nath showed no sign of backing down, Vaishnavi was compelled to kill him.",
    "Located in the oldest surviving city of the world- Varanasi, Kashi Vishwanath Temple is one of the most visited temples in India. It is the most revered of the twelve jyotirlingas located in India.\n" +
            "\n" +
            "The temple stands in all-might at the western bank of River Ganges and teaches mankind the true meaning of life and death. A one-time visit to the Kashi Vishwanath Temple is equivalent to the visit to other eleven jyotirlingas of Lord Shiva",
    "Built in the 12th century, Jagannath temple is situated in Puri, Orissa and is popularly called Jagannath Puri. Dedicated to Lord Krishna, the temple is one of the Char Dhams of India. The annual and world famous Rath Yatra conducted at Puri gives a chance to get a good glimpse of the Lord Jagannath along with Balabhadra and Subhadra riding on the chariots.",
    "This architectural wonder is situated in Madurai, Tamil Nadu and is dedicated to Goddess Parvati (also known as Meenakshi) and her husband Lord Shiva. Madurai is the second biggest city of India and is also one of the oldest cities of the world.\n" +
            "\n" +
            "A dip in the Golden Lotus tank, situated in the temple, is considered auspicious and is usually taken before visiting the main shrine of the God and Goddess. As per a legend, the pond was created by Lord Shiva and is even older than the temple.",
    "The holy cave of Amarnath is located at an altitude of 3,888 meters in the Union Territory of Jammu and Kashmir. Engulfed with snow-clad mountains, the cave mostly remains covered with snow during the year.\n" +
            "\n" +
            "In the summer season, between the months of June and August, it becomes accessible and hence opens up for the pilgrims. The cave is believed to be 5000 years old. ",
    "Lingaraja temple is one of the oldest and largest temples of the ‘Temple City of India’ – Odisha. Built in the typical architectural style of Kalinga, the temple doesn’t only attract religious devotees but also history enthusiasts.\n" +
            "\n" +
            "The idol of Lingaraj usually represents Lord Shiva, but in this temple, it symbolizes Lord Shiva and Lord Vishnu. The combined form of both the Gods is referred to as ‘Harihara’.\n" +
            "\n" +
            "A lake called Bindu Sagar touches the temple on one side and is said to have healing powers. Non-Hindus are not allowed to enter the premises.",
    "Located in the hilly town of Tirumala in Andhra Pradesh, the temple is also known as Tirumala Venkateswara temple. The temple is devoted to Lord Venkateshwara, who is popularly called ‘Balaji’ and is the incarnation of Lord Vishnu.\n" +
            "\n" +
            "Venkateshwara Tirupati Balaji is the second richest temple in India. The ancient temple was visited by many rulers of great South-Indian dynasties. The temple celebrates many festivals, most famous of them being Brahmotsavam (also known as ‘Salakatla brahmotsavam’), which goes on for 9 days and witnesses thousands of devotees.",
    "The City of Thousand Temples – Kanchipuram, Tamil Nadu is one of the seven sacred places in India wherein the people can attain moksha, as per the Hindu religion. Every temple in Kanchipuram is a fascinating element of architecture.",
    "Built in the 7th century, the temple is famous for being a functioning temple ever since it came into existence. Located in the village of Hampi, it is one of the most famous temples among the various other temples of Hampi. All heritage sites of Hampi have been recognized and are a part of UNESCO World Heritage Sites.\n" +
            "\n" +
            "A shrine of Shiva, Virupaksha temple is a very important religious centre as well as a popular tourist destination. ",
    "Constructed on the principles of Vastu Shastra and Pancharatra Shastra, this temple is situated near the banks of River Yamuna in Delhi. The authenticity of the temple is reflected in its resemblance with ancient Indian architecture and the spirituality the place exudes.\n" +
            "\n" +
            "The principal deity of the temple is Lord Swaminarayan, an incarnation of Lord Vishnu. The 11-feet idol lies below the central dome of the temple. The structure has been built of Rajasthani pink stone and Italian Carrara marble.\n" +
            "\n" +
            "The magnificent temple of Akshardham looks more stunning during the night with the beautifully installed lighting arrangements. ",
    "Thiruvananthapuram, the capital city of Kerala literally means the ‘City of Lord Anantha’. Shri Padmanabhaswamy Temple is one of the 108 Divya Desams (sacred dwellings of Lord Vishnu).\n" +
            "\n" +
            "The temple can be visited only by the Hindus. There is a strict dress code while entering the temple for men (dhoti without any kind of shirt) and women (sari or skirt and blouse). The elegant and splendid idol of Lord Vishnu is reclining over the five hooded serpents called Anantha in a deep yogic sleep.\n" +
            "\n" +
            "The idol is very fascinating as it displays the supreme trinity of Brahma, Vishnu and Mahesh (or Shiva). Lord Brahma is shown sitting on a lotus coming out of the navel of the Lord’s statue. That is why Lord Vishnu is also called Padmanabha, i.e. lotus-navel."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst=findViewById(R.id.lst);
        adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,temple);
        lst.setAdapter(adapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Temple_name",temple[i]);
                intent.putExtra("name",descriptions[i]);
               // intent.putExtra("name","hi");
                startActivity(intent);
            }
        });
    }
}