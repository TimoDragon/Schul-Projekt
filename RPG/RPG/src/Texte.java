public class Texte {
    //here are every Texts stored

    static String randomNumber = "Gebe eine Zahl ein zum vortfahren\n";
    static String choose = "\nWähle aus:\n";

    //after the game has started
    static String start1 = "##################################################\n";
    static String start2 = "Willkommen in unserem Spiel\nGebe eine Zahl ein, um das Spiel zu starten\n";

    //prologue
    static String prologue1 = "************************* Vorgeschichte *************************\n";
    static String prologue2 = "Schon seit mehreren hundert Jahren kämpfen die Menschen gegen eine bösartige\n"
                            + "Macht, welche mit Orks, Trollen, Goblins und vielen anderen Schreklichen Kreaturen\n"
                            + "zusammen Arbeitet. Als du 7 Jahre alt warst wurde dein Dorf durch Orks angegriffen und\n"
                            + "deine Eltern starben bei diesem Angriff. Mit den restlichen Überlebenden bist du in den\n"
                            + "Süden in das nahe gelegene Königreich gezogen und wurdest von einer alten Frau aufgenommen.\n";
    static String story1 = "*Du gehst durch die Stadt, ein Mann hählt dich auf*\n"
                            + "Akdov: Eyyyy… Warte… Du bist doch Antoinette, oder?\n" + choose
                            + "(1) Frage ihn wer er ist\n";
    static String story2 = "Du: Ja? Woher wissen Sie wie ich Heiße? Und wer sind Sie überhaupt?\n";
    static String story3 = "Akdov: Ach ja. Entschuldige mich. Ich bin Akdov. Ich komme aus Teya.\n"
                             + "       Wir können aber nicht hier stehen bleiben und reden. Die beobachten mich.\n";
    static String story4 = "(1) Frage ihn wer ihn beobachtet\n";
    static String story4A = "Du: Wer beobachtet Sie?";
    static String story5 = "Du: Wer beobachtet dich?"
                            + "Akdov: Ich erkläre dir gleich alles. Aber nicht hier. Kennst du ein Platz, wo es sicher ist?\n";
    static String story6 = "(1) Sage ihm er soll dir folgen\n";
    static String story7 = "Du: Ja, kommen Sie mit.\n*Ihr geht zu dem sicheren Ort*\nDu: Jetzt können wir reden.\nAkdov: Wo soll ich anfangen?\n       Mhhh....\n       Weißt du wer deine Eltern waren?\n";
    static String story8 = "(1) Sag ihm, dass du dich nicht an sie erinnerst.\n";
    static String story9 = "Du: Ich schätze normale Menschen. Ich kann mich aber nicht so gut an die erinnern.\n";
    static String story10 = "Akdov: Vor langer Zeit kannte ich dein Vater. Wir waren befreundet. Brandon war der beste\n       Bogenschütze in dem ganze Lande. Ich weiß, dass er dir Bogenschießen beigebracht hat. Ich hoffe,\n       dass du nach seinem Tod weiter übtest.\n"
                            + "Er hat mir viel über dich erzählt.\n       Und deine Mutter. Sie war die liebste Person, die ich je kannte. Es tut mir so leid. "
                            + "       ...\n       Aa, ja ich wollte dir noch über die Prophezeiung erzählen.\n*Akdov hört schritte*\nAkdov: Los!\n       Hier, es hilft dir alle Antworten zu finden!\n       Jetzt lauf!\n"
                            + "*Du nimmst die Karte, rennst weg und Akdov sagt einen Zauberspruch und verschwindet. Als du Zuhause ankommst öffnest du die Karte und schaust sie dir an.*\n";
    static String story11 = "(1) Gehe zum Makierten berreich auf der Karte\n(2) Erzähle Gertrude von dem Gespräch\n";


    //hau ab ohne Gertrude bescheid zu sagen
    static String storyA1 = "*Du packst die nötigsten Sachen ein und wartest bis es dunkel ist. Auf dem Weg nach draußen nimmst du noch ein Messer und eine Laterne mit*\n";
    static String storyA2 = "*Du hörst schritte und läufst weg, Gertrude schreit.*\nGertrude: Wer ist da?\n*Du läufst weiter.*\n";
    

    //Rede mit Gertrude über die Begegnung
    static String storyB1 = "Du: Gertrude, ich muss mit dir reden.\nGertrude: Warte einen Moment liebe. Ich bin gleich da.\n*Du packst die nötigsten Sachen ein und hörst aufeinmal ein Klopfen.*\n"
                            + "Gertrude: Ich bin jetzt da. Was wolltest du mir erzählen?\n";
    static String storyB2 = "(1) Erzähle Gertrude von der Begegnung\n";
    static String storyB3 = "Du: Wo soll ich anfangen... Als ich auf dem Marktplatz war begegnete ich einen Mann.\n    Er erzählte mir, dass "
                            + "er meine Eltern kannte. Der Mann wollte mit auch etwas über meine Prophezeiung sagen aber das hat er\n    nicht mehr geschafft, da er von jemanden verfolgt wurde. Er hat mir aber eine "
                            + "Karte gegeben.\n*Du zeigst Gertrude die Karte*\n"
                            + "Gertude: Liebe, du weißt aber schon, dass die Karte leer ist?\n";
    static String storyB4 = "(1) Sag ihr, dass auf der Karte ein Punkt ist\n";
    static String storyB5 = "Du: Nein, schau doch mal hier. Da ist ein Punkt makiert.\n"
                            + "Gertrude: Ich sehe nichts auf der Karte aber ich glaube dir. Was willst jetzt damit machen?\n";
    static String storyB6 = "(1) Sag ihr, dass du zum Punkt gehen wirst\n";
    static String storyB7 = "Gertrude: Du weißt aber das es Gefährlich sein kann. Hast du keine Angst?\n";
    static String storyB8 = "(1) Sag ihr, dass du trotzdem hingehen wirst\n";
    static String storyB9 = "Du: Ich habe nichts zu verlieren. Laut der Karte ist der makierte Berreich auch nicht weit weg. Ich kann Troy\n    und dahin reiten.\n"
                            + "Gertude: Okay, mach das. Brauchst du noch was?\n";
    static String storyB10 = "(1) Sage ihr, dass du eine Laterne und ein Messer brauchst\n";
    static String storyB11 = "Du: Ich könnte noch eine Laterne und ein Messer brauchen.\n"
                                + "Gertrude: Hier nimm die Laterne und das Messer. Sicher ist sicher.\n*Gertrude gibt dir eine Laterne und ein Messer*\n";
    static String storyB12 = "(1) Verabschiede dich\n ";
    static String storyB13 = "Du: Danke und auf wiedersehen!\nGertrude: Auf wiedersehen und pass auf dich auf.\n";

    //hier gehts nach dem Abhaueb/dem Gespräch weiter
    static String storyC1 = "*Du kommst an einenem Pferdestall an, wo dein Pferd namens Troy auf dich wartet.*\n";
    static String storyC2 = "(1) Begrüße Troy\n";
    static String storyC3 = "Du: Hi, großer, hast du Lust auf ein Abenteuer?\n*Du schreichelst Troy und steigst auf ihn drauf, du schaust auf die Karte und reitest los.\n"
                            + "Nach einer Welie errreichst du einen kleinen Wald. Plötzlich hörst du ein komisches Geräusch in den Büschen*\n";
    static String storyC4 = "(1) Du schaust nach was in dem Busch ist.\n(2) Du reitest weiter.\n";

    //Nachdem Toni los geritten ist und schaut was im Busch ist
    static String storyD1 = "*Du siehst einen Hund, welcher sich erschrickt und wegrent. Du reitest weiter.*\n";
    static String storyD2 = "*Ein Hund springt auf dich zu und beißt dich. Du verlierst 5 HP. Du reitest weiter.*\n";

    //Nachdem Toni los geritten ist und NICHT schaut was im Busch ist
    static String storyE1 = "*Du reitest weiter.*\n";

    //nach dem Busch
    static String storyF1 = "Du zu Troy: Ich glaube wir sind bald da.\n"
                            + "*Auf einmal siehst du einen Mann mit einem Messer*\n"
                            + "Mann: Wieso ist eine Junge Dame so spät noch unterwegs?\n"
                            + "*Du antwortest nicht*\n"
                            + "Mann: Was versteckst du da?\n"
                            + "*Der Mann reißt dir deinen Rucksack von deinem Rücken und schmeißt alle Sachen auf den Boden\n"
                            + "Er sammelt heruntergefallene Gold Stücke auf*\n";
    static String storyF2 = "(1) Greife den Mann an\n";

    //der Kampf gegen den Mann
    static String storyG1 = "*Du nimmst ein Messer in die Hand und sprintest auf den Mann zu*\n";
    static String storyG2 = "";
}