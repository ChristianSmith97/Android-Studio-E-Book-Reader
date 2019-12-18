package com.example.finalprojectquintenandchristian;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

//Submission for Quinten Rader and Christian Smith
//this is a basic EBook Reader
//11/27/19
public class MainActivity extends AppCompatActivity {
    //FINALIZED
    //initialize book buttons
    private Button CurrentBook;
    private Button book1;
    private Button book2;
    private Button book3;
    private Button book4;
    private Button book5;
    private Button book6;
    private Button book7;
    private Button book8;
    private Button book9;
    private Button book10;
    private Button book11;
    private Button book12;
    private Button book13;
    private Button book14;
    private Button book15;
    private Button book16;
    private Button book17;
    private Button book18;
    private Button book19;
    private Button book20;
    private Button book21;
    private Button book22;
    private Button book23;
    private Button book24;
    private Button book25;
    private Button book26;
    private Button book27;
    private Button book28;
    private Button book29;
    private Button book30;
    private Button book31;
    private Button book32;
    private Button book33;
    private Button book34;
    private Button book35;
    private Button book36;
    private Button book37;
    private Button book38;
    private Button book39;
    private Button book40;
    private Button book41;
    private Button book42;
    private Button book43;
    private Button book44;
    private Button book45;
    private Button book46;
    private Button book47;
    private Button book48;
    private Button book49;
    private Button book50;
    private Button book51;
    private Button book52;
    private Button book53;
    private Button book54;
    private Button book55;
    private Button book56;
    private Button book57;
    private Button book58;
    private Button book59;
    private Button book60;
    private Button book61;
    private Button book62;
    private Button book63;
    private Button book64;
    private Button book65;
    private Button book66;
    private Button book67;
    private Button book68;
    private Button book69;
    private Button book70;
    private Button book71;
    private Button book72;
    private Button book73;
    private Button book74;
    private Button book75;
    private Button book76;
    private Button book77;
    private Button book78;
    private Button book79;
    private Button book80;
    private Button book81;
    private Button book82;
    private Button book83;
    private Button book84;
    private Button book85;
    private Button book86;
    private Button book87;
    private Button book88;
    private Button book89;
    private Button book90;
    private Button book91;
    private Button book92;
    private Button book93;
    private Button book94;
    private Button book95;
    //initialize delete buttons
    private Button currentdbook;
    private Button dbook1;
    private Button dbook2;
    private Button dbook3;
    private Button dbook4;
    private Button dbook5;
    private Button dbook6;
    private Button dbook7;
    private Button dbook8;
    private Button dbook9;
    private Button dbook10;
    private Button dbook11;
    private Button dbook12;
    private Button dbook13;
    private Button dbook14;
    private Button dbook15;
    private Button dbook16;
    private Button dbook17;
    private Button dbook18;
    private Button dbook19;
    private Button dbook20;
    private Button dbook21;
    private Button dbook22;
    private Button dbook23;
    private Button dbook24;
    private Button dbook25;
    private Button dbook26;
    private Button dbook27;
    private Button dbook28;
    private Button dbook29;
    private Button dbook30;
    private Button dbook31;
    private Button dbook32;
    private Button dbook33;
    private Button dbook34;
    private Button dbook35;
    private Button dbook36;
    private Button dbook37;
    private Button dbook38;
    private Button dbook39;
    private Button dbook40;
    private Button dbook41;
    private Button dbook42;
    private Button dbook43;
    private Button dbook44;
    private Button dbook45;
    private Button dbook46;
    private Button dbook47;
    private Button dbook48;
    private Button dbook49;
    private Button dbook50;
    private Button dbook51;
    private Button dbook52;
    private Button dbook53;
    private Button dbook54;
    private Button dbook55;
    private Button dbook56;
    private Button dbook57;
    private Button dbook58;
    private Button dbook59;
    private Button dbook60;
    private Button dbook61;
    private Button dbook62;
    private Button dbook63;
    private Button dbook64;
    private Button dbook65;
    private Button dbook66;
    private Button dbook67;
    private Button dbook68;
    private Button dbook69;
    private Button dbook70;
    private Button dbook71;
    private Button dbook72;
    private Button dbook73;
    private Button dbook74;
    private Button dbook75;
    private Button dbook76;
    private Button dbook77;
    private Button dbook78;
    private Button dbook79;
    private Button dbook80;
    private Button dbook81;
    private Button dbook82;
    private Button dbook83;
    private Button dbook84;
    private Button dbook85;
    private Button dbook86;
    private Button dbook87;
    private Button dbook88;
    private Button dbook89;
    private Button dbook90;
    private Button dbook91;
    private Button dbook92;
    private Button dbook93;
    private Button dbook94;
    private Button dbook95;
    //initialize book array
    Button[] bArray;
    Button[] dbArray;
    BookItemClass[] BLArray;
    //initialize save data
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String BookList = null;

    //NEED WORKED ON - load preferences or create everything
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //load preferences
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        //identifying book button IDs
        CurrentBook = findViewById(R.id.b0);
        book1 = findViewById(R.id.b1);
        book2 = findViewById(R.id.b2);
        book3 = findViewById(R.id.b3);
        book4 = findViewById(R.id.b4);
        book5 = findViewById(R.id.b5);
        book6 = findViewById(R.id.b6);
        book7 = findViewById(R.id.b7);
        book8 = findViewById(R.id.b8);
        book9 = findViewById(R.id.b9);
        book10 = findViewById(R.id.b10);
        book11 = findViewById(R.id.b11);
        book12 = findViewById(R.id.b12);
        book13 = findViewById(R.id.b13);
        book14 = findViewById(R.id.b14);
        book15 = findViewById(R.id.b15);
        book16 = findViewById(R.id.b16);
        book17 = findViewById(R.id.b17);
        book18 = findViewById(R.id.b18);
        book19 = findViewById(R.id.b19);
        book20 = findViewById(R.id.b20);
        book21 = findViewById(R.id.b21);
        book22 = findViewById(R.id.b22);
        book23 = findViewById(R.id.b23);
        book24 = findViewById(R.id.b24);
        book25 = findViewById(R.id.b25);
        book26 = findViewById(R.id.b26);
        book27 = findViewById(R.id.b27);
        book28 = findViewById(R.id.b28);
        book29 = findViewById(R.id.b29);
        book30 = findViewById(R.id.b30);
        book31 = findViewById(R.id.b31);
        book32 = findViewById(R.id.b32);
        book33 = findViewById(R.id.b33);
        book34 = findViewById(R.id.b34);
        book35 = findViewById(R.id.b35);
        book36 = findViewById(R.id.b36);
        book37 = findViewById(R.id.b37);
        book38 = findViewById(R.id.b38);
        book39 = findViewById(R.id.b39);
        book40 = findViewById(R.id.b40);
        book41 = findViewById(R.id.b41);
        book42 = findViewById(R.id.b42);
        book43 = findViewById(R.id.b43);
        book44 = findViewById(R.id.b44);
        book45 = findViewById(R.id.b45);
        book46 = findViewById(R.id.b46);
        book47 = findViewById(R.id.b47);
        book48 = findViewById(R.id.b48);
        book49 = findViewById(R.id.b49);
        book50 = findViewById(R.id.b50);
        book51 = findViewById(R.id.b51);
        book52 = findViewById(R.id.b52);
        book53 = findViewById(R.id.b53);
        book54 = findViewById(R.id.b54);
        book55 = findViewById(R.id.b55);
        book56 = findViewById(R.id.b56);
        book57 = findViewById(R.id.b57);
        book58 = findViewById(R.id.b58);
        book59 = findViewById(R.id.b59);
        book60 = findViewById(R.id.b60);
        book61 = findViewById(R.id.b61);
        book62 = findViewById(R.id.b62);
        book63 = findViewById(R.id.b63);
        book64 = findViewById(R.id.b64);
        book65 = findViewById(R.id.b65);
        book66 = findViewById(R.id.b66);
        book67 = findViewById(R.id.b67);
        book68 = findViewById(R.id.b68);
        book69 = findViewById(R.id.b69);
        book70 = findViewById(R.id.b70);
        book71 = findViewById(R.id.b71);
        book72 = findViewById(R.id.b72);
        book73 = findViewById(R.id.b73);
        book74 = findViewById(R.id.b74);
        book75 = findViewById(R.id.b75);
        book76 = findViewById(R.id.b76);
        book77 = findViewById(R.id.b77);
        book78 = findViewById(R.id.b78);
        book79 = findViewById(R.id.b79);
        book80 = findViewById(R.id.b80);
        book81 = findViewById(R.id.b81);
        book82 = findViewById(R.id.b82);
        book83 = findViewById(R.id.b83);
        book84 = findViewById(R.id.b84);
        book85 = findViewById(R.id.b85);
        book86 = findViewById(R.id.b86);
        book87 = findViewById(R.id.b87);
        book88 = findViewById(R.id.b88);
        book89 = findViewById(R.id.b89);
        book90 = findViewById(R.id.b90);
        book91 = findViewById(R.id.b91);
        book92 = findViewById(R.id.b92);
        book93 = findViewById(R.id.b93);
        book94 = findViewById(R.id.b94);
        book95 = findViewById(R.id.b95);
        //array of book buttons
        bArray = new Button[]
                {
            CurrentBook,book1,book2,book3,book4,book5,book6,book7,book8,book9,
            book10,book11,book12,book13,book14,book15,book16,book17,book18,book19,
            book20,book21,book22,book23,book24,book25,book26,book27,book28,book29,
            book30,book31,book32,book33,book34,book35,book36,book37,book38,book39,
            book40,book41,book42,book43,book44,book45,book46,book47,book48,book49,
            book50,book51,book52,book53,book54,book55,book56,book57,book58,book59,
            book60,book61,book62,book63,book64,book65,book66,book67,book68,book69,
            book70,book71,book72,book73,book74,book75,book76,book77,book78,book79,
            book80,book81,book82,book83,book84,book85,book86,book87,book88,book89,
            book90,book91,book92,book93,book94,book95
        };
        //identifying delete button IDs
        currentdbook = findViewById(R.id.d0);
        dbook1 = findViewById(R.id.d1);
        dbook2 = findViewById(R.id.d2);
        dbook3 = findViewById(R.id.d3);
        dbook4 = findViewById(R.id.d4);
        dbook5 = findViewById(R.id.d5);
        dbook6 = findViewById(R.id.d6);
        dbook7 = findViewById(R.id.d7);
        dbook8 = findViewById(R.id.d8);
        dbook9 = findViewById(R.id.d9);
        dbook10 = findViewById(R.id.d10);
        dbook11 = findViewById(R.id.d11);
        dbook12 = findViewById(R.id.d12);
        dbook13 = findViewById(R.id.d13);
        dbook14 = findViewById(R.id.d14);
        dbook15 = findViewById(R.id.d15);
        dbook16 = findViewById(R.id.d16);
        dbook17 = findViewById(R.id.d17);
        dbook18 = findViewById(R.id.d18);
        dbook19 = findViewById(R.id.d19);
        dbook20 = findViewById(R.id.d20);
        dbook21 = findViewById(R.id.d21);
        dbook22 = findViewById(R.id.d22);
        dbook23 = findViewById(R.id.d23);
        dbook24 = findViewById(R.id.d24);
        dbook25 = findViewById(R.id.d25);
        dbook26 = findViewById(R.id.d26);
        dbook27 = findViewById(R.id.d27);
        dbook28 = findViewById(R.id.d28);
        dbook29 = findViewById(R.id.d29);
        dbook30 = findViewById(R.id.d30);
        dbook31 = findViewById(R.id.d31);
        dbook32 = findViewById(R.id.d32);
        dbook33 = findViewById(R.id.d33);
        dbook34 = findViewById(R.id.d34);
        dbook35 = findViewById(R.id.d35);
        dbook36 = findViewById(R.id.d36);
        dbook37 = findViewById(R.id.d37);
        dbook38 = findViewById(R.id.d38);
        dbook39 = findViewById(R.id.d39);
        dbook40 = findViewById(R.id.d40);
        dbook41 = findViewById(R.id.d41);
        dbook42 = findViewById(R.id.d42);
        dbook43 = findViewById(R.id.d43);
        dbook44 = findViewById(R.id.d44);
        dbook45 = findViewById(R.id.d45);
        dbook46 = findViewById(R.id.d46);
        dbook47 = findViewById(R.id.d47);
        dbook48 = findViewById(R.id.d48);
        dbook49 = findViewById(R.id.d49);
        dbook50 = findViewById(R.id.d50);
        dbook51 = findViewById(R.id.d51);
        dbook52 = findViewById(R.id.d52);
        dbook53 = findViewById(R.id.d53);
        dbook54 = findViewById(R.id.d54);
        dbook55 = findViewById(R.id.d55);
        dbook56 = findViewById(R.id.d56);
        dbook57 = findViewById(R.id.d57);
        dbook58 = findViewById(R.id.d58);
        dbook59 = findViewById(R.id.d59);
        dbook60 = findViewById(R.id.d60);
        dbook61 = findViewById(R.id.d61);
        dbook62 = findViewById(R.id.d62);
        dbook63 = findViewById(R.id.d63);
        dbook64 = findViewById(R.id.d64);
        dbook65 = findViewById(R.id.d65);
        dbook66 = findViewById(R.id.d66);
        dbook67 = findViewById(R.id.d67);
        dbook68 = findViewById(R.id.d68);
        dbook69 = findViewById(R.id.d69);
        dbook70 = findViewById(R.id.d70);
        dbook71 = findViewById(R.id.d71);
        dbook72 = findViewById(R.id.d72);
        dbook73 = findViewById(R.id.d73);
        dbook74 = findViewById(R.id.d74);
        dbook75 = findViewById(R.id.d75);
        dbook76 = findViewById(R.id.d76);
        dbook77 = findViewById(R.id.d77);
        dbook78 = findViewById(R.id.d78);
        dbook79 = findViewById(R.id.d79);
        dbook80 = findViewById(R.id.d80);
        dbook81 = findViewById(R.id.d81);
        dbook82 = findViewById(R.id.d82);
        dbook83 = findViewById(R.id.d83);
        dbook84 = findViewById(R.id.d84);
        dbook85 = findViewById(R.id.d85);
        dbook86 = findViewById(R.id.d86);
        dbook87 = findViewById(R.id.d87);
        dbook88 = findViewById(R.id.d88);
        dbook89 = findViewById(R.id.d89);
        dbook90 = findViewById(R.id.d90);
        dbook91 = findViewById(R.id.d91);
        dbook92 = findViewById(R.id.d92);
        dbook93 = findViewById(R.id.d93);
        dbook94 = findViewById(R.id.d94);
        dbook95 = findViewById(R.id.d95);
        //FINALIZED
        //array of delete buttons
        dbArray = new Button[]
                {
                currentdbook,dbook1,dbook2,dbook3,dbook4,dbook5,dbook6,dbook7,dbook8,dbook9,
                dbook10,dbook11,dbook12,dbook13,dbook14,dbook15,dbook16,dbook17,dbook18,dbook19,
                dbook20,dbook21,dbook22,dbook23,dbook24,dbook25,dbook26,dbook27,dbook28,dbook29,
                dbook30,dbook31,dbook32,dbook33,dbook34,dbook35,dbook36,dbook37,dbook38,dbook39,
                dbook40,dbook41,dbook42,dbook43,dbook44,dbook45,dbook46,dbook47,dbook48,dbook49,
                dbook50,dbook51,dbook52,dbook53,dbook54,dbook55,dbook56,dbook57,dbook58,dbook59,
                dbook60,dbook61,dbook62,dbook63,dbook64,dbook65,dbook66,dbook67,dbook68,dbook69,
                dbook70,dbook71,dbook72,dbook73,dbook74,dbook75,dbook76,dbook77,dbook78,dbook79,
                dbook80,dbook81,dbook82,dbook83,dbook84,dbook85,dbook86,dbook87,dbook88,dbook89,
                dbook90,dbook91,dbook92,dbook93,dbook94,dbook95
            };
        //CHECK IF BOOK LIST ALREADY EXISTS, IF SO LOAD IT, IF NOT POPULATE IT
        if(BookList != null){
            Gson gson = new Gson();
            String json = sharedPreferences.getString(BookList,null);
            Type type = new TypeToken<BookItemClass[]>() {}.getType();
            BLArray = gson.fromJson(json,type);
        }
        else{
            //populate available books
            BookItemClass currentBook = new BookItemClass("","","");
            BookItemClass b1 = new BookItemClass("Adventures of Huckleberry Finn","Mark Twain","https://www.gutenberg.org/files/76/76-0.txt");
            BookItemClass b2 = new BookItemClass("The Adventures of Sherlock Holmes","Arthur Conan Doyle","https://www.gutenberg.org/files/1661/1661-0.txt");
            BookItemClass b3 = new BookItemClass("The Adventures of Tom Sawyer","Mark Twain","https://www.gutenberg.org/files/74/74-0.txt");
            BookItemClass b4 = new BookItemClass("Alice's Adventures in Wonderland","Lewis Carroll","https://www.gutenberg.org/files/11/11-0.txt");
            BookItemClass b5 = new BookItemClass("Also sprach Zarathustra. English","Friedrich Wilhelm Nietzsche","https://www.gutenberg.org/files/1998/1998-0.txt");
            BookItemClass b6 = new BookItemClass("An Occurrence at Owl Creek Bridge","Ambrose Bierce","http://www.gutenberg.org/cache/epub/375/pg375.txt");
            BookItemClass b7 = new BookItemClass("Anne of Green Gables","L. M.  Montgomery","https://www.gutenberg.org/files/45/45-0.txt");
            BookItemClass b8 = new BookItemClass("Anthem","Ayn Rand","http://www.gutenberg.org/cache/epub/1250/pg1250.txt");
            BookItemClass b9 = new BookItemClass("Autobiography of Benjamin Franklin","Benjamin Franklin","http://www.gutenberg.org/cache/epub/20203/pg20203.txt");
            BookItemClass b10 = new BookItemClass("The Awakening, and Selected Short Stories","Kate Chopin","https://www.gutenberg.org/files/160/160-0.txt");
            BookItemClass b11 = new BookItemClass("Beowulf: An Anglo-Saxon Epic Poem","","http://www.gutenberg.org/cache/epub/16328/pg16328.txt");
            BookItemClass b12 = new BookItemClass("Beyond Good and Evil","Friedrich Wilhelm Nietzsche","http://www.gutenberg.org/cache/epub/4363/pg4363.txt");
            BookItemClass b13 = new BookItemClass("The Brothers Karamazov","Fyodor Dostoyevsky","https://www.gutenberg.org/files/28054/28054-0.txt");
            BookItemClass b14 = new BookItemClass("Candide","Voltaire","http://www.gutenberg.org/cache/epub/19942/pg19942.txt");
            BookItemClass b15 = new BookItemClass("The Chaldean Account of Genesis	A. H.","Sayce and George Smith","https://www.gutenberg.org/files/60559/60559-0.txt");
            BookItemClass b16 = new BookItemClass("A Christmas Carol in Prose; Being a Ghost Story of Christmas","Charles Dickens","https://www.gutenberg.org/files/46/46-0.txt");
            BookItemClass b17 = new BookItemClass("Common Sense","Thomas Paine","http://www.gutenberg.org/cache/epub/147/pg147.txt");
            BookItemClass b18 = new BookItemClass("The Complete Works of William Shakespeare","William Shakespeare","https://www.gutenberg.org/files/100/100-0.txt");
            BookItemClass b19 = new BookItemClass("The Confessions of St. Augustine","Bishop of Hippo Saint Augustine","http://www.gutenberg.org/cache/epub/3296/pg3296.txt");
            BookItemClass b20 = new BookItemClass("The Count of Monte Cristo","Alexandre Dumas","https://www.gutenberg.org/files/1184/1184-0.txt");
            BookItemClass b21 = new BookItemClass("Crime and Punishment","Fyodor Dostoyevsky","https://www.gutenberg.org/files/2554/2554-0.txt");
            BookItemClass b22 = new BookItemClass("The Criticism of the Fourth Gospel","W. Sanday","https://www.gutenberg.org/files/60553/60553-0.txt");
            BookItemClass b23 = new BookItemClass("Democracy in America Ñ Volume 1","Alexis de Tocqueville","http://www.gutenberg.org/cache/epub/815/pg815.txt");
            BookItemClass b24 = new BookItemClass("The Devil's Dictionary","Ambrose Bierce","http://www.gutenberg.org/cache/epub/972/pg972.txt");
            BookItemClass b25 = new BookItemClass("Divine Comedy, Longfellow's Translation, Hell","Dante Alighieri","http://www.gutenberg.org/cache/epub/1001/pg1001.txt");
            BookItemClass b26 = new BookItemClass("A Doll's House: a play","Henrik Ibsen","http://www.gutenberg.org/cache/epub/2542/pg2542.txt");
            BookItemClass b27 = new BookItemClass("Dracula","Bram Stoker","http://www.gutenberg.org/cache/epub/345/pg345.txt");
            BookItemClass b28 = new BookItemClass("Dubliners","James Joyce","https://www.gutenberg.org/files/2814/2814-0.txt");
            BookItemClass b29 = new BookItemClass("Emma","Jane Austen","https://www.gutenberg.org/files/158/158-0.txt");
            BookItemClass b30 = new BookItemClass("Essays by Ralph Waldo Emerson","Ralph Waldo Emerson","http://www.gutenberg.org/cache/epub/16643/pg16643.txt");
            BookItemClass b31 = new BookItemClass("Essays of Michel de Montaigne Ñ Complete","Michel de Montaigne","https://www.gutenberg.org/files/3600/3600-0.txt");
            BookItemClass b32 = new BookItemClass("Ethan Frome","Edith Wharton","https://www.gutenberg.org/files/4517/4517-0.txt");
            BookItemClass b33 = new BookItemClass("Frankenstein; Or, The Modern Prometheus","Mary Wollstonecraft Shelley","https://www.gutenberg.org/files/84/84-0.txt");
            BookItemClass b34 = new BookItemClass("Great Expectations","Charles Dickens","https://www.gutenberg.org/files/1400/1400-0.txt");
            BookItemClass b35 = new BookItemClass("Grimms' Fairy Tales","Jacob Grimm and Wilhelm Grimm","https://www.gutenberg.org/files/2591/2591-0.txt");
            BookItemClass b36 = new BookItemClass("Gulliver's Travels into Several Remote Nations of the World","Jonathan Swift","https://www.gutenberg.org/files/829/829-0.txt");
            BookItemClass b37 = new BookItemClass("Heart of Darkness","Joseph Conrad","https://www.gutenberg.org/files/219/219-0.txt");
            BookItemClass b38 = new BookItemClass("The Hound of the Baskervilles","Arthur Conan Doyle","https://www.gutenberg.org/files/2852/2852-0.txt");
            BookItemClass b39 = new BookItemClass("How the Other Half Lives: Studies Among the Tenements of New York","Jacob A.  Riis","http://www.gutenberg.org/cache/epub/45502/pg45502.txt");
            BookItemClass b40 = new BookItemClass("The Iliad","Homer","http://www.gutenberg.org/cache/epub/6130/pg6130.txt");
            BookItemClass b41 = new BookItemClass("The Importance of Being Earnest: A Trivial Comedy for Serious People","Oscar Wilde","http://www.gutenberg.org/cache/epub/844/pg844.txt");
            BookItemClass b42 = new BookItemClass("Incidents in the Life of a Slave Girl, Written by Herself","Harriet A.  Jacobs","http://www.gutenberg.org/cache/epub/11030/pg11030.txt");
            BookItemClass b43 = new BookItemClass("The Interesting Narrative of the Life of Olaudah Equiano, Or Gustavus Vassa, The African","Equiano","http://www.gutenberg.org/cache/epub/15399/pg15399.txt");
            BookItemClass b44 = new BookItemClass("Ion","Plato","http://www.gutenberg.org/cache/epub/1635/pg1635.txt");
            BookItemClass b45 = new BookItemClass("Jane Eyre: An Autobiography","Charlotte Bront‘","http://www.gutenberg.org/cache/epub/1260/pg1260.txt");
            BookItemClass b46 = new BookItemClass("The Jungle","Upton Sinclair","https://www.gutenberg.org/files/140/140-0.txt");
            BookItemClass b47 = new BookItemClass("The Kama Sutra of Vatsyayana","Vatsyayana","http://www.gutenberg.org/cache/epub/27827/pg27827.txt");
            BookItemClass b48 = new BookItemClass("Le Morte d'Arthur: Volume 1","Sir Thomas Malory","https://www.gutenberg.org/files/1251/1251-0.txt");
            BookItemClass b49 = new BookItemClass("Leaves of Grass","Walt Whitman","https://www.gutenberg.org/files/1322/1322-0.txt");
            BookItemClass b50 = new BookItemClass("The Legend of Sleepy Hollow","Washington Irving","https://www.gutenberg.org/files/41/41-0.txt");
            BookItemClass b51 = new BookItemClass("Les MisŽrables","Victor Hugo","https://www.gutenberg.org/files/135/135-0.txt");
            BookItemClass b52 = new BookItemClass("Leviathan","Thomas Hobbes","http://www.gutenberg.org/cache/epub/3207/pg3207.txt");
            BookItemClass b53 = new BookItemClass("The Life and Adventures of Robinson Crusoe","Daniel Defoe","https://www.gutenberg.org/files/521/521-0.txt");
            BookItemClass b54 = new BookItemClass("Little Women","Louisa May Alcott","http://www.gutenberg.org/cache/epub/514/pg514.txt");
            BookItemClass b55 = new BookItemClass("Metamorphosis","Franz Kafka","http://www.gutenberg.org/cache/epub/5200/pg5200.txt");
            BookItemClass b56 = new BookItemClass("Moby Dick; Or, The Whale","Herman Melville","https://www.gutenberg.org/files/2701/2701-0.txt");
            BookItemClass b57 = new BookItemClass("Modern Copper Smelting","Donald M. Levy","https://www.gutenberg.org/files/59328/59328-0.txt");
            BookItemClass b58 = new BookItemClass("A Modest Proposal","Jonathan Swift","https://www.gutenberg.org/files/1080/1080-0.txt");
            BookItemClass b59 = new BookItemClass("Narrative of the Captivity and Restoration of Mrs. Mary Rowlandson","Mary White Rowlandson","http://www.gutenberg.org/cache/epub/851/pg851.txt");
            BookItemClass b60 = new BookItemClass("Narrative of the Life of Frederick Douglass, an American Slave","Frederick Douglass","http://www.gutenberg.org/cache/epub/23/pg23.txt");
            BookItemClass b61 = new BookItemClass("On Liberty","John Stuart Mill","http://www.gutenberg.org/cache/epub/34901/pg34901.txt");
            BookItemClass b62 = new BookItemClass("The Parochial History of Cornwall, Volume 1","","https://www.gutenberg.org/files/60555/60555-0.txt");
            BookItemClass b63 = new BookItemClass("Peter Pan","J. M.  Barrie","https://www.gutenberg.org/files/16/16-0.txt");
            BookItemClass b64 = new BookItemClass("The Picture of Dorian Gray","Oscar Wilde","http://www.gutenberg.org/cache/epub/174/pg174.txt");
            BookItemClass b65 = new BookItemClass("Pride and Prejudice","Jane Austen","https://www.gutenberg.org/files/1342/1342-0.txt");
            BookItemClass b66 = new BookItemClass("The Prince","Niccol˜ Machiavelli","http://www.gutenberg.org/cache/epub/1232/pg1232.txt");
            BookItemClass b67 = new BookItemClass("The Problems of Philosophy","Bertrand Russell","http://www.gutenberg.org/cache/epub/5827/pg5827.txt");
            BookItemClass b68 = new BookItemClass("The Prophet","Kahlil Gibran","https://www.gutenberg.org/files/58585/58585-0.txt");
            BookItemClass b69 = new BookItemClass("Pygmalion","Bernard Shaw","http://www.gutenberg.org/cache/epub/3825/pg3825.txt");
            BookItemClass b70 = new BookItemClass("The Republic","Plato","http://www.gutenberg.org/cache/epub/1497/pg1497.txt");
            BookItemClass b71 = new BookItemClass("The Scarlet Letter","Nathaniel Hawthorne","https://www.gutenberg.org/files/25344/25344-0.txt");
            BookItemClass b72 = new BookItemClass("Second Treatise of Government","John Locke","http://www.gutenberg.org/cache/epub/7370/pg7370.txt");
            BookItemClass b73 = new BookItemClass("Sense and Sensibility","Jane Austen","http://www.gutenberg.org/cache/epub/161/pg161.txt");
            BookItemClass b74 = new BookItemClass("Siddhartha","Hermann Hesse","http://www.gutenberg.org/cache/epub/2500/pg2500.txt");
            BookItemClass b75 = new BookItemClass("Songs of Innocence, and Songs of Experience","William Blake","https://www.gutenberg.org/files/1934/1934-0.txt");
            BookItemClass b76 = new BookItemClass("The Souls of Black Folk	W. E. B.","Du Bois","http://www.gutenberg.org/cache/epub/408/pg408.txt");
            BookItemClass b77 = new BookItemClass("The Strange Case of Dr. Jekyll and Mr. Hyde","Robert Louis Stevenson","https://www.gutenberg.org/files/43/43-0.txt");
            BookItemClass b78 = new BookItemClass("A Study in Scarlet","Arthur Conan Doyle","https://www.gutenberg.org/files/244/244-0.txt");
            BookItemClass b79 = new BookItemClass("A Tale of Two Cities","Charles Dickens","https://www.gutenberg.org/files/98/98-0.txt");
            BookItemClass b80 = new BookItemClass("The Theory of the Leisure Class","Thorstein Veblen","http://www.gutenberg.org/cache/epub/833/pg833.txt");
            BookItemClass b81 = new BookItemClass("The Time Machine","H. G.  Wells","https://www.gutenberg.org/files/35/35-0.txt");
            BookItemClass b82 = new BookItemClass("The Tragical History of Doctor Faustus","Christopher Marlowe","http://www.gutenberg.org/cache/epub/779/pg779.txt");
            BookItemClass b83 = new BookItemClass("Treasure Island","Robert Louis Stevenson","https://www.gutenberg.org/files/120/120-0.txt");
            BookItemClass b84 = new BookItemClass("The Turn of the Screw","Henry James","https://www.gutenberg.org/files/209/209-0.txt");
            BookItemClass b85 = new BookItemClass("Ulysses","James Joyce","https://www.gutenberg.org/files/4300/4300-0.txt");
            BookItemClass b86 = new BookItemClass("Uncle Tom's Cabin","Harriet Beecher Stowe","https://www.gutenberg.org/files/203/203-0.txt");
            BookItemClass b87 = new BookItemClass("The Used People Lot","Irving E. Fang","http://www.gutenberg.org/cache/epub/60545/pg60545.txt");
            BookItemClass b88 = new BookItemClass("Walden, and On The Duty Of Civil Disobedience","Henry David Thoreau","https://www.gutenberg.org/files/205/205-0.txt");
            BookItemClass b89 = new BookItemClass("War and Peace","graf Leo Tolstoy","https://www.gutenberg.org/files/2600/2600-0.txt");
            BookItemClass b90 = new BookItemClass("The War of the Worlds","H. G.  Wells","https://www.gutenberg.org/files/36/36-0.txt");
            BookItemClass b91 = new BookItemClass("The Wonderful Wizard of Oz","L. Frank  Baum","http://www.gutenberg.org/cache/epub/55/pg55.txt");
            BookItemClass b92 = new BookItemClass("The Works of Edgar Allan Poe Ñ Volume 2","Edgar Allan Poe","https://www.gutenberg.org/files/2148/2148-0.txt");
            BookItemClass b93 = new BookItemClass("The Works of Edgar Allan Poe, The Raven Edition","Edgar Allan Poe","http://www.gutenberg.org/cache/epub/25525/pg25525.txt");
            BookItemClass b94 = new BookItemClass("Wuthering Heights","Emily Bront'","http://www.gutenberg.org/cache/epub/768/pg768.txt");
            BookItemClass b95 = new BookItemClass("The Yellow Wallpaper","Charlotte Perkins Gilman","https://www.gutenberg.org/files/1952/1952-0.txt");
            //FINALIZED
            //insert available books into book array
            BLArray = new BookItemClass[]{
                    currentBook,
                    b1, b2, b3, b4, b5, b6, b7, b8, b9,
                    b10, b11, b12, b13, b14, b15, b16, b17, b18, b19,
                    b20, b21, b22, b23, b24, b25, b26, b27, b28, b29,
                    b30, b31, b32, b33, b34, b35, b36, b37, b38, b39,
                    b40, b41, b42, b43, b44, b45, b46, b47, b48, b49,
                    b50, b51, b52, b53, b54, b55, b56, b57, b58, b59,
                    b60, b61, b62, b63, b64, b65, b66, b67, b68, b69,
                    b70, b71, b72, b73, b74, b75, b76, b77, b78, b79,
                    b80, b81, b82, b83, b84, b85, b86, b87, b88, b89,
                    b90, b91, b92, b93, b94, b95
            };



            //override book list
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Gson gson = new Gson();
            String json1 = gson.toJson(BLArray);
            editor.putString(BookList,json1);
            editor.apply();
        }

        //populate button text with book titles
        for(int i = 0;i<96;i++){
            bArray[i].setText(BLArray[i].getBookTitle());
        }

    }//close onCreate

    //NEED TO WORK ON - on click checks if the book is downloaded first, if so it passes the book, if not it downloads it and changes the buttons color
    //opens book
    public void o(View v){
        //location of book in BookArray
        int id = Integer.parseInt(getResources().getResourceEntryName(v.getId()).substring(1));

        //opens new activity and passes book info
        Intent intent = new Intent(MainActivity.this, ReadActivity.class);
        intent.putExtra("bookURL", BLArray[id].getURL());
        startActivity(intent);
    }
    //NEED TO WORK ON - on click deletes the string in book array, then changes the color of the book button
    //deletes book
    public void d(View v){
        int id = Integer.parseInt(getResources().getResourceEntryName(v.getId()).substring(1));
        BLArray[id].setContent("");

    }

}//close main activity

//FINALIZED

