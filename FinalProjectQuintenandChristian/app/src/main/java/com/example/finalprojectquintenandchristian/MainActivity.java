package com.example.finalprojectquintenandchristian;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

//Submission for Quinten Rader and Christian Smith
//this is a basic EBook Reader
//11/27/19
public class MainActivity extends AppCompatActivity {

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

    Book currentBook = new Book("","","");
    Book b1 = new Book("Adventures of Huckleberry Finn","Mark Twain","https://www.gutenberg.org/files/76/76-0.txt");
    Book b2 = new Book("The Adventures of Sherlock Holmes","Arthur Conan Doyle","https://www.gutenberg.org/files/1661/1661-0.txt");
    Book b3 = new Book("The Adventures of Tom Sawyer","Mark Twain","https://www.gutenberg.org/files/74/74-0.txt");
    Book b4 = new Book("Alice's Adventures in Wonderland","Lewis Carroll","https://www.gutenberg.org/files/11/11-0.txt");
    Book b5 = new Book("Also sprach Zarathustra. English","Friedrich Wilhelm Nietzsche","https://www.gutenberg.org/files/1998/1998-0.txt");
    Book b6 = new Book("An Occurrence at Owl Creek Bridge","Ambrose Bierce","http://www.gutenberg.org/cache/epub/375/pg375.txt");
    Book b7 = new Book("Anne of Green Gables","L. M.  Montgomery","https://www.gutenberg.org/files/45/45-0.txt");
    Book b8 = new Book("Anthem","Ayn Rand","http://www.gutenberg.org/cache/epub/1250/pg1250.txt");
    Book b9 = new Book("Autobiography of Benjamin Franklin","Benjamin Franklin","http://www.gutenberg.org/cache/epub/20203/pg20203.txt");
    Book b10 = new Book("The Awakening, and Selected Short Stories","Kate Chopin","https://www.gutenberg.org/files/160/160-0.txt");
    Book b11 = new Book("Beowulf: An Anglo-Saxon Epic Poem","","http://www.gutenberg.org/cache/epub/16328/pg16328.txt");
    Book b12 = new Book("Beyond Good and Evil","Friedrich Wilhelm Nietzsche","http://www.gutenberg.org/cache/epub/4363/pg4363.txt");
    Book b13 = new Book("The Brothers Karamazov","Fyodor Dostoyevsky","https://www.gutenberg.org/files/28054/28054-0.txt");
    Book b14 = new Book("Candide","Voltaire","http://www.gutenberg.org/cache/epub/19942/pg19942.txt");
    Book b15 = new Book("The Chaldean Account of Genesis	A. H.","Sayce and George Smith","https://www.gutenberg.org/files/60559/60559-0.txt");
    Book b16 = new Book("A Christmas Carol in Prose; Being a Ghost Story of Christmas","Charles Dickens","https://www.gutenberg.org/files/46/46-0.txt");
    Book b17 = new Book("Common Sense","Thomas Paine","http://www.gutenberg.org/cache/epub/147/pg147.txt");
    Book b18 = new Book("The Complete Works of William Shakespeare","William Shakespeare","https://www.gutenberg.org/files/100/100-0.txt");
    Book b19 = new Book("The Confessions of St. Augustine","Bishop of Hippo Saint Augustine","http://www.gutenberg.org/cache/epub/3296/pg3296.txt");
    Book b20 = new Book("The Count of Monte Cristo","Alexandre Dumas","https://www.gutenberg.org/files/1184/1184-0.txt");
    Book b21 = new Book("Crime and Punishment","Fyodor Dostoyevsky","https://www.gutenberg.org/files/2554/2554-0.txt");
    Book b22 = new Book("The Criticism of the Fourth Gospel","W. Sanday","https://www.gutenberg.org/files/60553/60553-0.txt");
    Book b23 = new Book("Democracy in America Ñ Volume 1","Alexis de Tocqueville","http://www.gutenberg.org/cache/epub/815/pg815.txt");
    Book b24 = new Book("The Devil's Dictionary","Ambrose Bierce","http://www.gutenberg.org/cache/epub/972/pg972.txt");
    Book b25 = new Book("Divine Comedy, Longfellow's Translation, Hell","Dante Alighieri","http://www.gutenberg.org/cache/epub/1001/pg1001.txt");
    Book b26 = new Book("A Doll's House: a play","Henrik Ibsen","http://www.gutenberg.org/cache/epub/2542/pg2542.txt");
    Book b27 = new Book("Dracula","Bram Stoker","http://www.gutenberg.org/cache/epub/345/pg345.txt");
    Book b28 = new Book("Dubliners","James Joyce","https://www.gutenberg.org/files/2814/2814-0.txt");
    Book b29 = new Book("Emma","Jane Austen","https://www.gutenberg.org/files/158/158-0.txt");
    Book b30 = new Book("Essays by Ralph Waldo Emerson","Ralph Waldo Emerson","http://www.gutenberg.org/cache/epub/16643/pg16643.txt");
    Book b31 = new Book("Essays of Michel de Montaigne Ñ Complete","Michel de Montaigne","https://www.gutenberg.org/files/3600/3600-0.txt");
    Book b32 = new Book("Ethan Frome","Edith Wharton","https://www.gutenberg.org/files/4517/4517-0.txt");
    Book b33 = new Book("Frankenstein; Or, The Modern Prometheus","Mary Wollstonecraft Shelley","https://www.gutenberg.org/files/84/84-0.txt");
    Book b34 = new Book("Great Expectations","Charles Dickens","https://www.gutenberg.org/files/1400/1400-0.txt");
    Book b35 = new Book("Grimms' Fairy Tales","Jacob Grimm and Wilhelm Grimm","https://www.gutenberg.org/files/2591/2591-0.txt");
    Book b36 = new Book("Gulliver's Travels into Several Remote Nations of the World","Jonathan Swift","https://www.gutenberg.org/files/829/829-0.txt");
    Book b37 = new Book("Heart of Darkness","Joseph Conrad","https://www.gutenberg.org/files/219/219-0.txt");
    Book b38 = new Book("The Hound of the Baskervilles","Arthur Conan Doyle","https://www.gutenberg.org/files/2852/2852-0.txt");
    Book b39 = new Book("How the Other Half Lives: Studies Among the Tenements of New York","Jacob A.  Riis","http://www.gutenberg.org/cache/epub/45502/pg45502.txt");
    Book b40 = new Book("The Iliad","Homer","http://www.gutenberg.org/cache/epub/6130/pg6130.txt");
    Book b41 = new Book("The Importance of Being Earnest: A Trivial Comedy for Serious People","Oscar Wilde","http://www.gutenberg.org/cache/epub/844/pg844.txt");
    Book b42 = new Book("Incidents in the Life of a Slave Girl, Written by Herself","Harriet A.  Jacobs","http://www.gutenberg.org/cache/epub/11030/pg11030.txt");
    Book b43 = new Book("The Interesting Narrative of the Life of Olaudah Equiano, Or Gustavus Vassa, The African","Equiano","http://www.gutenberg.org/cache/epub/15399/pg15399.txt");
    Book b44 = new Book("Ion","Plato","http://www.gutenberg.org/cache/epub/1635/pg1635.txt");
    Book b45 = new Book("Jane Eyre: An Autobiography","Charlotte Bront‘","http://www.gutenberg.org/cache/epub/1260/pg1260.txt");
    Book b46 = new Book("The Jungle","Upton Sinclair","https://www.gutenberg.org/files/140/140-0.txt");
    Book b47 = new Book("The Kama Sutra of Vatsyayana","Vatsyayana","http://www.gutenberg.org/cache/epub/27827/pg27827.txt");
    Book b48 = new Book("Le Morte d'Arthur: Volume 1","Sir Thomas Malory","https://www.gutenberg.org/files/1251/1251-0.txt");
    Book b49 = new Book("Leaves of Grass","Walt Whitman","https://www.gutenberg.org/files/1322/1322-0.txt");
    Book b50 = new Book("The Legend of Sleepy Hollow","Washington Irving","https://www.gutenberg.org/files/41/41-0.txt");
    Book b51 = new Book("Les MisŽrables","Victor Hugo","https://www.gutenberg.org/files/135/135-0.txt");
    Book b52 = new Book("Leviathan","Thomas Hobbes","http://www.gutenberg.org/cache/epub/3207/pg3207.txt");
    Book b53 = new Book("The Life and Adventures of Robinson Crusoe","Daniel Defoe","https://www.gutenberg.org/files/521/521-0.txt");
    Book b54 = new Book("Little Women","Louisa May Alcott","http://www.gutenberg.org/cache/epub/514/pg514.txt");
    Book b55 = new Book("Metamorphosis","Franz Kafka","http://www.gutenberg.org/cache/epub/5200/pg5200.txt");
    Book b56 = new Book("Moby Dick; Or, The Whale","Herman Melville","https://www.gutenberg.org/files/2701/2701-0.txt");
    Book b57 = new Book("Modern Copper Smelting","Donald M. Levy","https://www.gutenberg.org/files/59328/59328-0.txt");
    Book b58 = new Book("A Modest Proposal","Jonathan Swift","https://www.gutenberg.org/files/1080/1080-0.txt");
    Book b59 = new Book("Narrative of the Captivity and Restoration of Mrs. Mary Rowlandson","Mary White Rowlandson","http://www.gutenberg.org/cache/epub/851/pg851.txt");
    Book b60 = new Book("Narrative of the Life of Frederick Douglass, an American Slave","Frederick Douglass","http://www.gutenberg.org/cache/epub/23/pg23.txt");
    Book b61 = new Book("On Liberty","John Stuart Mill","http://www.gutenberg.org/cache/epub/34901/pg34901.txt");
    Book b62 = new Book("The Parochial History of Cornwall, Volume 1","","https://www.gutenberg.org/files/60555/60555-0.txt");
    Book b63 = new Book("Peter Pan","J. M.  Barrie","https://www.gutenberg.org/files/16/16-0.txt");
    Book b64 = new Book("The Picture of Dorian Gray","Oscar Wilde","http://www.gutenberg.org/cache/epub/174/pg174.txt");
    Book b65 = new Book("Pride and Prejudice","Jane Austen","https://www.gutenberg.org/files/1342/1342-0.txt");
    Book b66 = new Book("The Prince","Niccol˜ Machiavelli","http://www.gutenberg.org/cache/epub/1232/pg1232.txt");
    Book b67 = new Book("The Problems of Philosophy","Bertrand Russell","http://www.gutenberg.org/cache/epub/5827/pg5827.txt");
    Book b68 = new Book("The Prophet","Kahlil Gibran","https://www.gutenberg.org/files/58585/58585-0.txt");
    Book b69 = new Book("Pygmalion","Bernard Shaw","http://www.gutenberg.org/cache/epub/3825/pg3825.txt");
    Book b70 = new Book("The Republic","Plato","http://www.gutenberg.org/cache/epub/1497/pg1497.txt");
    Book b71 = new Book("The Scarlet Letter","Nathaniel Hawthorne","https://www.gutenberg.org/files/25344/25344-0.txt");
    Book b72 = new Book("Second Treatise of Government","John Locke","http://www.gutenberg.org/cache/epub/7370/pg7370.txt");
    Book b73 = new Book("Sense and Sensibility","Jane Austen","http://www.gutenberg.org/cache/epub/161/pg161.txt");
    Book b74 = new Book("Siddhartha","Hermann Hesse","http://www.gutenberg.org/cache/epub/2500/pg2500.txt");
    Book b75 = new Book("Songs of Innocence, and Songs of Experience","William Blake","https://www.gutenberg.org/files/1934/1934-0.txt");
    Book b76 = new Book("The Souls of Black Folk	W. E. B.","Du Bois","http://www.gutenberg.org/cache/epub/408/pg408.txt");
    Book b77 = new Book("The Strange Case of Dr. Jekyll and Mr. Hyde","Robert Louis Stevenson","https://www.gutenberg.org/files/43/43-0.txt");
    Book b78 = new Book("A Study in Scarlet","Arthur Conan Doyle","https://www.gutenberg.org/files/244/244-0.txt");
    Book b79 = new Book("A Tale of Two Cities","Charles Dickens","https://www.gutenberg.org/files/98/98-0.txt");
    Book b80 = new Book("The Theory of the Leisure Class","Thorstein Veblen","http://www.gutenberg.org/cache/epub/833/pg833.txt");
    Book b81 = new Book("The Time Machine","H. G.  Wells","https://www.gutenberg.org/files/35/35-0.txt");
    Book b82 = new Book("The Tragical History of Doctor Faustus","Christopher Marlowe","http://www.gutenberg.org/cache/epub/779/pg779.txt");
    Book b83 = new Book("Treasure Island","Robert Louis Stevenson","https://www.gutenberg.org/files/120/120-0.txt");
    Book b84 = new Book("The Turn of the Screw","Henry James","https://www.gutenberg.org/files/209/209-0.txt");
    Book b85 = new Book("Ulysses","James Joyce","https://www.gutenberg.org/files/4300/4300-0.txt");
    Book b86 = new Book("Uncle Tom's Cabin","Harriet Beecher Stowe","https://www.gutenberg.org/files/203/203-0.txt");
    Book b87 = new Book("The Used People Lot","Irving E. Fang","http://www.gutenberg.org/cache/epub/60545/pg60545.txt");
    Book b88 = new Book("Walden, and On The Duty Of Civil Disobedience","Henry David Thoreau","https://www.gutenberg.org/files/205/205-0.txt");
    Book b89 = new Book("War and Peace","graf Leo Tolstoy","https://www.gutenberg.org/files/2600/2600-0.txt");
    Book b90 = new Book("The War of the Worlds","H. G.  Wells","https://www.gutenberg.org/files/36/36-0.txt");
    Book b91 = new Book("The Wonderful Wizard of Oz","L. Frank  Baum","http://www.gutenberg.org/cache/epub/55/pg55.txt");
    Book b92 = new Book("The Works of Edgar Allan Poe Ñ Volume 2","Edgar Allan Poe","https://www.gutenberg.org/files/2148/2148-0.txt");
    Book b93 = new Book("The Works of Edgar Allan Poe, The Raven Edition","Edgar Allan Poe","http://www.gutenberg.org/cache/epub/25525/pg25525.txt");
    Book b94 = new Book("Wuthering Heights","Emily Bront'","http://www.gutenberg.org/cache/epub/768/pg768.txt");
    Book b95 = new Book("The Yellow Wallpaper","Charlotte Perkins Gilman","https://www.gutenberg.org/files/1952/1952-0.txt");


    Book[] BLArray = new Book[]
            {
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



    public static final String SHARED_PREFS = "sharedPrefs";
    public static final Book[] BookList = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        Button[] bArray=
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

        Button[] dbArray=
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

        Book currentBook = new Book("","","");
        Book b1 = new Book("Adventures of Huckleberry Finn","Mark Twain","https://www.gutenberg.org/files/76/76-0.txt");
        Book b2 = new Book("The Adventures of Sherlock Holmes","Arthur Conan Doyle","https://www.gutenberg.org/files/1661/1661-0.txt");
        Book b3 = new Book("The Adventures of Tom Sawyer","Mark Twain","https://www.gutenberg.org/files/74/74-0.txt");
        Book b4 = new Book("Alice's Adventures in Wonderland","Lewis Carroll","https://www.gutenberg.org/files/11/11-0.txt");
        Book b5 = new Book("Also sprach Zarathustra. English","Friedrich Wilhelm Nietzsche","https://www.gutenberg.org/files/1998/1998-0.txt");
        Book b6 = new Book("An Occurrence at Owl Creek Bridge","Ambrose Bierce","http://www.gutenberg.org/cache/epub/375/pg375.txt");
        Book b7 = new Book("Anne of Green Gables","L. M.  Montgomery","https://www.gutenberg.org/files/45/45-0.txt");
        Book b8 = new Book("Anthem","Ayn Rand","http://www.gutenberg.org/cache/epub/1250/pg1250.txt");
        Book b9 = new Book("Autobiography of Benjamin Franklin","Benjamin Franklin","http://www.gutenberg.org/cache/epub/20203/pg20203.txt");
        Book b10 = new Book("The Awakening, and Selected Short Stories","Kate Chopin","https://www.gutenberg.org/files/160/160-0.txt");
        Book b11 = new Book("Beowulf: An Anglo-Saxon Epic Poem","","http://www.gutenberg.org/cache/epub/16328/pg16328.txt");
        Book b12 = new Book("Beyond Good and Evil","Friedrich Wilhelm Nietzsche","http://www.gutenberg.org/cache/epub/4363/pg4363.txt");
        Book b13 = new Book("The Brothers Karamazov","Fyodor Dostoyevsky","https://www.gutenberg.org/files/28054/28054-0.txt");
        Book b14 = new Book("Candide","Voltaire","http://www.gutenberg.org/cache/epub/19942/pg19942.txt");
        Book b15 = new Book("The Chaldean Account of Genesis	A. H.","Sayce and George Smith","https://www.gutenberg.org/files/60559/60559-0.txt");
        Book b16 = new Book("A Christmas Carol in Prose; Being a Ghost Story of Christmas","Charles Dickens","https://www.gutenberg.org/files/46/46-0.txt");
        Book b17 = new Book("Common Sense","Thomas Paine","http://www.gutenberg.org/cache/epub/147/pg147.txt");
        Book b18 = new Book("The Complete Works of William Shakespeare","William Shakespeare","https://www.gutenberg.org/files/100/100-0.txt");
        Book b19 = new Book("The Confessions of St. Augustine","Bishop of Hippo Saint Augustine","http://www.gutenberg.org/cache/epub/3296/pg3296.txt");
        Book b20 = new Book("The Count of Monte Cristo","Alexandre Dumas","https://www.gutenberg.org/files/1184/1184-0.txt");
        Book b21 = new Book("Crime and Punishment","Fyodor Dostoyevsky","https://www.gutenberg.org/files/2554/2554-0.txt");
        Book b22 = new Book("The Criticism of the Fourth Gospel","W. Sanday","https://www.gutenberg.org/files/60553/60553-0.txt");
        Book b23 = new Book("Democracy in America Ñ Volume 1","Alexis de Tocqueville","http://www.gutenberg.org/cache/epub/815/pg815.txt");
        Book b24 = new Book("The Devil's Dictionary","Ambrose Bierce","http://www.gutenberg.org/cache/epub/972/pg972.txt");
        Book b25 = new Book("Divine Comedy, Longfellow's Translation, Hell","Dante Alighieri","http://www.gutenberg.org/cache/epub/1001/pg1001.txt");
        Book b26 = new Book("A Doll's House: a play","Henrik Ibsen","http://www.gutenberg.org/cache/epub/2542/pg2542.txt");
        Book b27 = new Book("Dracula","Bram Stoker","http://www.gutenberg.org/cache/epub/345/pg345.txt");
        Book b28 = new Book("Dubliners","James Joyce","https://www.gutenberg.org/files/2814/2814-0.txt");
        Book b29 = new Book("Emma","Jane Austen","https://www.gutenberg.org/files/158/158-0.txt");
        Book b30 = new Book("Essays by Ralph Waldo Emerson","Ralph Waldo Emerson","http://www.gutenberg.org/cache/epub/16643/pg16643.txt");
        Book b31 = new Book("Essays of Michel de Montaigne Ñ Complete","Michel de Montaigne","https://www.gutenberg.org/files/3600/3600-0.txt");
        Book b32 = new Book("Ethan Frome","Edith Wharton","https://www.gutenberg.org/files/4517/4517-0.txt");
        Book b33 = new Book("Frankenstein; Or, The Modern Prometheus","Mary Wollstonecraft Shelley","https://www.gutenberg.org/files/84/84-0.txt");
        Book b34 = new Book("Great Expectations","Charles Dickens","https://www.gutenberg.org/files/1400/1400-0.txt");
        Book b35 = new Book("Grimms' Fairy Tales","Jacob Grimm and Wilhelm Grimm","https://www.gutenberg.org/files/2591/2591-0.txt");
        Book b36 = new Book("Gulliver's Travels into Several Remote Nations of the World","Jonathan Swift","https://www.gutenberg.org/files/829/829-0.txt");
        Book b37 = new Book("Heart of Darkness","Joseph Conrad","https://www.gutenberg.org/files/219/219-0.txt");
        Book b38 = new Book("The Hound of the Baskervilles","Arthur Conan Doyle","https://www.gutenberg.org/files/2852/2852-0.txt");
        Book b39 = new Book("How the Other Half Lives: Studies Among the Tenements of New York","Jacob A.  Riis","http://www.gutenberg.org/cache/epub/45502/pg45502.txt");
        Book b40 = new Book("The Iliad","Homer","http://www.gutenberg.org/cache/epub/6130/pg6130.txt");
        Book b41 = new Book("The Importance of Being Earnest: A Trivial Comedy for Serious People","Oscar Wilde","http://www.gutenberg.org/cache/epub/844/pg844.txt");
        Book b42 = new Book("Incidents in the Life of a Slave Girl, Written by Herself","Harriet A.  Jacobs","http://www.gutenberg.org/cache/epub/11030/pg11030.txt");
        Book b43 = new Book("The Interesting Narrative of the Life of Olaudah Equiano, Or Gustavus Vassa, The African","Equiano","http://www.gutenberg.org/cache/epub/15399/pg15399.txt");
        Book b44 = new Book("Ion","Plato","http://www.gutenberg.org/cache/epub/1635/pg1635.txt");
        Book b45 = new Book("Jane Eyre: An Autobiography","Charlotte Bront‘","http://www.gutenberg.org/cache/epub/1260/pg1260.txt");
        Book b46 = new Book("The Jungle","Upton Sinclair","https://www.gutenberg.org/files/140/140-0.txt");
        Book b47 = new Book("The Kama Sutra of Vatsyayana","Vatsyayana","http://www.gutenberg.org/cache/epub/27827/pg27827.txt");
        Book b48 = new Book("Le Morte d'Arthur: Volume 1","Sir Thomas Malory","https://www.gutenberg.org/files/1251/1251-0.txt");
        Book b49 = new Book("Leaves of Grass","Walt Whitman","https://www.gutenberg.org/files/1322/1322-0.txt");
        Book b50 = new Book("The Legend of Sleepy Hollow","Washington Irving","https://www.gutenberg.org/files/41/41-0.txt");
        Book b51 = new Book("Les MisŽrables","Victor Hugo","https://www.gutenberg.org/files/135/135-0.txt");
        Book b52 = new Book("Leviathan","Thomas Hobbes","http://www.gutenberg.org/cache/epub/3207/pg3207.txt");
        Book b53 = new Book("The Life and Adventures of Robinson Crusoe","Daniel Defoe","https://www.gutenberg.org/files/521/521-0.txt");
        Book b54 = new Book("Little Women","Louisa May Alcott","http://www.gutenberg.org/cache/epub/514/pg514.txt");
        Book b55 = new Book("Metamorphosis","Franz Kafka","http://www.gutenberg.org/cache/epub/5200/pg5200.txt");
        Book b56 = new Book("Moby Dick; Or, The Whale","Herman Melville","https://www.gutenberg.org/files/2701/2701-0.txt");
        Book b57 = new Book("Modern Copper Smelting","Donald M. Levy","https://www.gutenberg.org/files/59328/59328-0.txt");
        Book b58 = new Book("A Modest Proposal","Jonathan Swift","https://www.gutenberg.org/files/1080/1080-0.txt");
        Book b59 = new Book("Narrative of the Captivity and Restoration of Mrs. Mary Rowlandson","Mary White Rowlandson","http://www.gutenberg.org/cache/epub/851/pg851.txt");
        Book b60 = new Book("Narrative of the Life of Frederick Douglass, an American Slave","Frederick Douglass","http://www.gutenberg.org/cache/epub/23/pg23.txt");
        Book b61 = new Book("On Liberty","John Stuart Mill","http://www.gutenberg.org/cache/epub/34901/pg34901.txt");
        Book b62 = new Book("The Parochial History of Cornwall, Volume 1","","https://www.gutenberg.org/files/60555/60555-0.txt");
        Book b63 = new Book("Peter Pan","J. M.  Barrie","https://www.gutenberg.org/files/16/16-0.txt");
        Book b64 = new Book("The Picture of Dorian Gray","Oscar Wilde","http://www.gutenberg.org/cache/epub/174/pg174.txt");
        Book b65 = new Book("Pride and Prejudice","Jane Austen","https://www.gutenberg.org/files/1342/1342-0.txt");
        Book b66 = new Book("The Prince","Niccol˜ Machiavelli","http://www.gutenberg.org/cache/epub/1232/pg1232.txt");
        Book b67 = new Book("The Problems of Philosophy","Bertrand Russell","http://www.gutenberg.org/cache/epub/5827/pg5827.txt");
        Book b68 = new Book("The Prophet","Kahlil Gibran","https://www.gutenberg.org/files/58585/58585-0.txt");
        Book b69 = new Book("Pygmalion","Bernard Shaw","http://www.gutenberg.org/cache/epub/3825/pg3825.txt");
        Book b70 = new Book("The Republic","Plato","http://www.gutenberg.org/cache/epub/1497/pg1497.txt");
        Book b71 = new Book("The Scarlet Letter","Nathaniel Hawthorne","https://www.gutenberg.org/files/25344/25344-0.txt");
        Book b72 = new Book("Second Treatise of Government","John Locke","http://www.gutenberg.org/cache/epub/7370/pg7370.txt");
        Book b73 = new Book("Sense and Sensibility","Jane Austen","http://www.gutenberg.org/cache/epub/161/pg161.txt");
        Book b74 = new Book("Siddhartha","Hermann Hesse","http://www.gutenberg.org/cache/epub/2500/pg2500.txt");
        Book b75 = new Book("Songs of Innocence, and Songs of Experience","William Blake","https://www.gutenberg.org/files/1934/1934-0.txt");
        Book b76 = new Book("The Souls of Black Folk	W. E. B.","Du Bois","http://www.gutenberg.org/cache/epub/408/pg408.txt");
        Book b77 = new Book("The Strange Case of Dr. Jekyll and Mr. Hyde","Robert Louis Stevenson","https://www.gutenberg.org/files/43/43-0.txt");
        Book b78 = new Book("A Study in Scarlet","Arthur Conan Doyle","https://www.gutenberg.org/files/244/244-0.txt");
        Book b79 = new Book("A Tale of Two Cities","Charles Dickens","https://www.gutenberg.org/files/98/98-0.txt");
        Book b80 = new Book("The Theory of the Leisure Class","Thorstein Veblen","http://www.gutenberg.org/cache/epub/833/pg833.txt");
        Book b81 = new Book("The Time Machine","H. G.  Wells","https://www.gutenberg.org/files/35/35-0.txt");
        Book b82 = new Book("The Tragical History of Doctor Faustus","Christopher Marlowe","http://www.gutenberg.org/cache/epub/779/pg779.txt");
        Book b83 = new Book("Treasure Island","Robert Louis Stevenson","https://www.gutenberg.org/files/120/120-0.txt");
        Book b84 = new Book("The Turn of the Screw","Henry James","https://www.gutenberg.org/files/209/209-0.txt");
        Book b85 = new Book("Ulysses","James Joyce","https://www.gutenberg.org/files/4300/4300-0.txt");
        Book b86 = new Book("Uncle Tom's Cabin","Harriet Beecher Stowe","https://www.gutenberg.org/files/203/203-0.txt");
        Book b87 = new Book("The Used People Lot","Irving E. Fang","http://www.gutenberg.org/cache/epub/60545/pg60545.txt");
        Book b88 = new Book("Walden, and On The Duty Of Civil Disobedience","Henry David Thoreau","https://www.gutenberg.org/files/205/205-0.txt");
        Book b89 = new Book("War and Peace","graf Leo Tolstoy","https://www.gutenberg.org/files/2600/2600-0.txt");
        Book b90 = new Book("The War of the Worlds","H. G.  Wells","https://www.gutenberg.org/files/36/36-0.txt");
        Book b91 = new Book("The Wonderful Wizard of Oz","L. Frank  Baum","http://www.gutenberg.org/cache/epub/55/pg55.txt");
        Book b92 = new Book("The Works of Edgar Allan Poe Ñ Volume 2","Edgar Allan Poe","https://www.gutenberg.org/files/2148/2148-0.txt");
        Book b93 = new Book("The Works of Edgar Allan Poe, The Raven Edition","Edgar Allan Poe","http://www.gutenberg.org/cache/epub/25525/pg25525.txt");
        Book b94 = new Book("Wuthering Heights","Emily Bront'","http://www.gutenberg.org/cache/epub/768/pg768.txt");
        Book b95 = new Book("The Yellow Wallpaper","Charlotte Perkins Gilman","https://www.gutenberg.org/files/1952/1952-0.txt");


        Book[] BLArray = new Book[]
        {
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
    for(int i = 0;i<96;i++){
        bArray[i].setText(BLArray[i].getBookTitle());
    }

    }//close onCreate

    //opens book
    public void o(View v){
        //location of book in BookArray
        int id = Integer.parseInt(getResources().getResourceEntryName(v.getId()).substring(1));

        //opens new activity and passes book info
        Intent intent = new Intent(MainActivity.this, ReadActivity.class);
        intent.putExtra("bookURL", BLArray[id].getURL());
        startActivity(intent);
    }
    //deletes book
    public void d(View v){

    }

}//close main activity


class Book extends AppCompatActivity
    {
        //variables
        private String bookTitle;
        private String author;
        private String URL;
        private Boolean isDownloaded;
        private String content;
        //couldn't figure out what i had to save the location in the book via scroll location
        //int location;
        //constructor

        public Book(String T, String A, String U)
        {
            bookTitle = T;
            author = A;
            URL = U;
        }
        //getter and setter functions
        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setURL(String URL) {
            this.URL = URL;
        }

        public String getURL() {
            return URL;
        }

        public void setDownloaded(Boolean downloaded) {
            isDownloaded = downloaded;
        }

        public boolean getIsDownloaded(){
            return isDownloaded;
        }
    }
