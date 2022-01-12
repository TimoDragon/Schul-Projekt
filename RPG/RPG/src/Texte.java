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
                            + "Macht, welche mit Orks, Trollen, Goblins und vielen anderen schreklichen Kreaturen\n"
                            + "zusammen Arbeitet. Als du 7 Jahre alt warst wurde dein Dorf durch Orks angegriffen und\n"
                            + "deine Eltern starben bei diesem Angriff. Mit den restlichen Überlebenden bist du in den\n"
                            + "Süden in das nahe gelegene Königreich gezogen und wurdest von einer alten Frau aufgenommen.\n";
    static String story1 = "*Du gehst durch die Stadt, ein Mann hählt dich auf*\n"
                            + "Akdov: Eyyyy… Warte… Du bist doch Antoinette, oder?\n" + choose
                            + "(1) Frage ihn wer er ist\n";
    static String story2 = "Du: Ja? Woher wissen Sie wie ich heiße? Und wer sind Sie überhaupt?\n";
    static String story3 = "Akdov: Ach ja. Entschuldige mich. Ich bin Akdov. Ich komme aus Teya.\n"
                             + "       Wir können aber nicht hier stehen bleiben und reden. Die beobachten mich.\n";
    static String story4 = "(1) Frage ihn wer ihn beobachtet\n";
    static String story5 = "Du: Wer beobachtet Sie?\n"
                            + "Akdov: Ich erkläre dir gleich alles. Aber nicht hier. Kennst du ein Platz, wo es sicher ist?\n";
    static String story6 = "(1) Sage ihm er soll dir folgen\n";
    static String story7 = "Du: Ja, kommen Sie mit.\n*Ihr geht zu dem sicheren Ort*\nDu: Jetzt können wir reden.\nAkdov: Wo soll ich anfangen?\n       Mhhh....\n       ch erzähle dir was über deiner Eltern\n";
    static String story8 = "(1) Sag ihm, dass du dich nicht an sie erinnerst.\n";
    static String story9 = "Du: Ich kann mich an die nicht so gut erinnern.\n";
    static String story10 = "Akdov: Vor langer Zeit kannte ich dein Vater. Wir waren befreundet. Brandon war der beste\n       Bogenschütze in dem ganze Lande. Ich weiß, dass er dir Bogenschießen beigebracht hat. Ich hoffe,\n       dass du nach seinem Tod weiter übtest.\n"
                            + "Er hat mir viel über dich erzählt.\n       Und deine Mutter. Sie war die liebste Person, die ich je kannte. Es tut mir so leid. "
                            + "       ...\n       Aa, ja ich wollte dir noch über die Prophezeiung erzählen.\n*Akdov hört schritte*\nAkdov: Los!\n       Hier, es hilft dir alle Antworten zu finden!\n       Jetzt lauf! Schnell!\n"
                            + "*Du nimmst die Karte und rennst weg. Akdov sagt einen Zauberspruch und verschwindet. Als du Zuhause ankommst öffnest du die Karte und schaust sie dir an. Ein Punkt erscheint dir.*\n";
    static String story11 = "(1) Gehe zum Makierten berreich auf der Karte\n(2) Erzähle Gertrude von dem Gespräch\n";


    //hau ab ohne Gertrude bescheid zu sagen. Kannst entweder ein Messer oder eine Laterne wählen 
    static String storyA1 = "*Du packst die nötigsten Sachen ein und wartest bis es dunkel ist. Auf dem Weg nach draußen nimmst du noch ein Messer und eine Laterne mit*\n";
    static String storyA2 = "*Du hörst schritte und läufst weg, Gertrude schreit.*\nGertrude: Wer ist da?\n*Du läufst aber weiter.*\n";
    

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
                            + "Gertrude: Ich sehe nichts auf der Karte, aber ich glaube dir. Was willst jetzt damit machen?\n";
    static String storyB6 = "(1) Sag ihr, dass du zum Punkt gehen wirst\n";
    static String storyB7 = "Gertrude: Du weißt aber das es Gefährlich sein kann. Hast du keine Angst?\n";
    static String storyB8 = "(1) Sag ihr, dass du trotzdem hingehen wirst\n";
    static String storyB9 = "Du: Ich habe nichts zu verlieren. Laut der Karte ist der makierte Berreich auch nicht weit weg. Ich nehme Troy\n    und reite dahin.\n"
                            + "Gertude: Okay, mach das. Brauchst du noch was?\n";
    static String storyB10 = "(1) Sage ihr, dass du eine Laterne und ein Messer brauchst\n";
    static String storyB11 = "Du: Ich könnte noch eine Laterne und ein Messer brauchen.\n"
                                + "Gertrude: Hier nimm die Laterne und das Messer. Sicher ist sicher.\n*Gertrude gibt dir eine Laterne und ein Messer*\n";
    static String storyB12 = "(1) Verabschiede dich\n ";
    static String storyB13 = "Du: Danke und auf wiedersehen!\nGertrude: Auf wiedersehen und pass auf dich auf.\n";

    //hier gehts nach dem Abhauen/dem Gespräch weiter
    static String storyC1 = "*Du kommst an einenem Pferdestall an, wo dein Pferd namens Troy auf dich wartet.*\n";
    static String storyC2 = "(1) Begrüße Troy\n";
    static String storyC3 = "Du: Hi, großer, hast du Lust auf ein Abenteuer?\n*Du schreichelst Troy und steigst auf ihn drauf, du schaust auf die Karte und reitest los.\n"
                            + "Nach einer Welie ereichst du einen kleinen Wald. Plötzlich hörst du ein komisches Geräusch in den Büschen*\n";
    static String storyC4 = "(1) Du schaust nach was in dem Busch ist.\n(2) Du reitest weiter.\n";

    //Nachdem Toni los geritten ist und schaut was im Busch ist (Laterne)?
    static String storyD1 = "*Du siehst einen Hund, welcher sich erschreckt und wegrent. Du reitest weiter.*\n";
   //Ohne Laterne?
    static String storyD2 = "*Ein Hund springt auf dich zu und beißt dich. Du verlierst 5 HP. Du reitest weiter.*\n";

    //Nachdem Toni los geritten ist und NICHT schaut was im Busch ist
    static String storyE1 = "*Du reitest weiter.*\n";

    //nach dem Busch
    static String storyF1 = "Du zu Troy: Ich glaube wir sind bald da.\n"
                            + "*Auf einmal siehst du einen Mann mit einem Messer.*\n"
                            + "Dieb: Wieso ist eine Junge Dame so spät noch unterwegs?\n"
                            + "*Du antwortest nicht.*\n"
                            + "Dieb: Was versteckst du da?\n"
                            + "*Der Dieb reißt dir deinen Rucksack von deinem Rücken und schmeißt alle Sachen auf den Boden\n"
                            + "Er sammelt heruntergefallene Gold Stücke auf.*\n";

    //der Kampf gegen den Mann (Option 1)
    static String storyG1 = "*Du nimmst ein Messer in die Hand und sprintest auf den Mann zu.*\n";
    static String storyG2 = "(1) Greif den Dieb an\n";
    //der Kampf gegen den Mann (Option 2)
    static String storyG3 = "*Du guckst dem Mann an. Der Mann fängt an in Richtung Troy zu gehen*\n"
                            +"Dieb: Für dem kriege ich mindestens 50 Gold Stücke.\n"
                            + "*Du kriegst Angst und weiß nicht was du machen sollst. Du siehst deine Laterne . Gehst hinter dem Dieb und schalgst ihm. Er wird sauer.*\n";
    static String storyG4 = "(1) Greif den Dieb an\n";
    
    //Nach dem Kampf
    static String storyG5 = "*Plötlich kommt ein großer Mann, welcher den Dieb verjagt. Er hilft dir aufzustehen.*\n";
    static String storyG6 = "(1) Frag ihn, wer er ist\n";
    static String storyG7 = "Du: Danke! Wer bist du?\n"
                            + "...: Ich bin Liam. Mir wurde gesagt, dass ich dir helfen soll also komm mit kleine.\n"
                            + "Du: Hi\n"
                            + "Liam: Hi\n"
                            + "Liam: Ich dachte, dass du ein Junge sein wirst. Bin aber positiv überrascht\n"
                            + "*10 Minuten später stehen du und Liam vor einem Haus, ihr geht rein\n*"
                            + "Liam: Akdov hat einen Bogen für dich hier gelassen. *Liam gibt dir einen Bogen*\n";

    static String storyG8 = "(1) Begutachte den Bogen\n";
    static String storyG9 = "Du: Der ist Wunderschön. *Du spannst den Bogen und lässt los. Ein Pfeil erscheint aus dem Nichts und schießt quer durch den Raum.\n*"
                            + "Liam: Willst du micht umbringen? *lacht*\n";
    static String storyG10 = "(1) Erzähle Liam von der Prophezeiung.\n";
    static String storyG11 = "Du: Akdov hat mir von einer Prophezeiung erzählt.\n"
                            + "Liam: Er hat mir nichts darüber erzählt. Er sagte aber, dass ich mir dir zum nächsten makierten Berreicht auf der Karte hin gehen soll.\n"
                            + "*Du gehst in einen Laden.*\n";
//shoppen

    static String storyG12 = "*Nächster Tag.*\n" 
                            + "Liam: Aufstehen!\n";
    static String storyG13 = "(1) Sag Liam, dass er dich in ruhe lassen soll.\n";
    static String storyG14 = "Du: Gleich.\n"
                            + "Liam: Wir mussen los laufen. Komm nach unten. Ich mach dir was zum Essen.\n"
                            + "Du: Jaaa. Ich ziehe mich noch schnell um.\n"
                            + "*Liam guckt Toni an.*\n"
                            + "Du: Geh bitte raus! *lacht*\n"
                            + "*Liam guckt dich böse an und geht raus.*\n";
    static String storyH1 = "*10 minuten später.*\n"
                            + "*Du gehst nach unten, isst dein Frühstück und ihr fährt los.*\n"
                            + "*Nach 3 Stunden Weg, steht ihr vor einem See.*\n";
    static String storyH2 = "(1) Frag wie ihr auf die Insel kommt.\n";
    static String storyH3 = "Du: Wollen wir durch der See schwimmen.\n"
                            + "*Du läufst in Richtung des Wassers.*\n"
                            + "Liam: NEIN!\n"
                            + "*Aufeinmal fängt was dein Bein und zieht dich in das Wasser rein.*\n"
                            + "*Liam läuft in deiner Richtung und schneidet die Hand ab.*\n";
    static String storyH4 = "(1) Frag Liam, was das war.\n";
    static String storyH5 =  "Wa... Was war da?\n!"
                            + "Liam: Eine Meerjungfrau. Die sind schrecklich.\n"
                            + "Liam: Wir müssen ein Floß bauen.\n"
                            + "*Ihr geht zum Wald und sammelt Stocke. Liam erzählt dir über seiner Kindheit. Das Floß ist fertig*\n"
                            + "*Ihr schwimmt durch den See*\n";
    //der Kampf gegen die Meerjungfrauen

    static String storyH6 = "*Du umarmst Liam*\n"
                            + "Toni: Wir haben uberlebt!\n"
                            + "Liam: Komm kleine. Wir müssen weiterlaufen.\n"
                            + "*Die beiden sehen ein großes, altes Haus.*\n"
                            + "Du: Ich hoffe wir sind hier richtig.\n"
                            + "*Liam öffnet lagsam die Tür. Sie durchsuchen zusammen das Haus.*\n"
                            + "Du: Hier ist nichts.\n"
                            + "Liam: Vielleicht ist hier ein Geheimraum.\n"
                            + "Du: Wonah soll ich suchen?\n"
                            + "Liam: Lass die Bücherregalen durchsuchen.\n";
    static String storyH7 = "(1) Fang an die Regalen durchzusuchen.\n"
                            + "Du: Wonach soll ich suchen?\n"
                            + "Liam: Lass die Bücherregale durchsuchen.\n";
    static String storyH8 = "(1) Fang an die Regalen durchzusuchen.\n"
                            + "Du: Liam! Ich habe was gefunden! Hier. Das Buch kann man nicht Bewegen.\n"
                            + "*Liam zieht das Buch. Ein Regal öffnet sich.*\n";
    static String storyH9 = "(1) Geh gucken wo das Weg führt.\n"
                            + "Du: Hier sind Treppen. Die führen nach unten.\n"
                            + "*Du gehst langsam nach unten. Das Regal schließt sich.*\n"
                            + "Du: Liam!! Hörst du mich!\n"
                            + "Liam: Ich kann es nicht öffnen! Du kannst aber weiter gehen! Ich komme so schnell wie es geht\n";
//Toni geht die Treppen runter (Entweder fällt sie runter (ohne Laterne) oder nicht)
//Toni redet mit Stimmen                            
    static String storyI1 = "*Du bist in einem alten, staubigen Zimmer in einem Keller. Das Zimmer ist voll mit alten Büchern und in der Mitte ist ein Podium. Du gehst näher dran. Auf dem Podium liegt ein großes, altes Buch.\n";
    static String storyI2 = "(1) Öffne das Buch.\n"
                            + "Die Seiten bewegen sich. Durch dem Zimmer fliegen Bücher. Der Zeit stoppt. Eine Lichtquelle zeigt auf dich. Du hörst auf einmal Stimmen.*\n"
                            + "Stimme1:	Das ist unsere Heldin\n"
                            + "Stimme2:	Die wird uns retten\n"
                            + "Stimme3:	Glaube ich nicht\n"
                            + "Stimme3:	Wie hast du, die Meerjungfrauen überlebt?\n"
                            + "Stimme2:	Ist doch nicht so wichtig\n"
                            + "Stimme1:	Zurück zu Sache. Du hast uns gefunden. Wir warteten 467 Jahren auf dich\n"
                            + "Stimme3:	Zu viele Jahren\n"
                            + "Stimme2:	Kannst du bitte deine Kommentare weglassen\n"
                            + "Stimme3:	Uhh\n"
                            + "Stimme1:	Wir sind hier, um dir die Prophezeiung zu erzählen.\n"
                            + "Stimme1: Paar Jahre vor dem Krieg hatten wir eine Vision. Uns würde gezeigt, was passieren wird. Die bösartigen Mächte vermehrten sich langsam und fangen an das Land zu übernehmen. Viele gute Kreaturen werden in Kriegen sterben. Keiner könnte es verhindern. Wir haben aber auch gesehen, dass an einem gewitterigen Tag, unsere Heldin geboren wird. An dem Tag hat auch für kurz die Sonne geschient und für ein kleines Moment war alles wieder normal. Deine Eltern haben dich von dem bösen König versteckt. Er hat euch aber nach paar Jahren gefunden. Er wollte dich umbringen als du klein warst, damit du ihm später nicht umbringen kannst. Deine Eltern haben es aber nicht zugelassen und haben sich für dich geopfert. Dein Schicksal ist es, ihn zu töten.\n"
                            + "Du: Ich weiß aber nicht, wie ich es machen soll und ob ich es schaffe.\n"
                            + "Stimme2:	Akdov hat dir doch eine Karte gegeben. Die Punkte zeigen dir Plätze, wo du Leute findest, die dir helfen werden. \n"
                            + "Stimme1: Es wird schwer, wir glauben aber an dich!\n"
                            + "Stimme3: Wer glaubt, der glaubt!\n"
                            + "Stimme1:	Hör nicht auf ihm.\n"
                            + "Stimme2:	Bevor du gehst. Der Zeit ist bald um. Du musst ihm so schnell wie möglich töten. Sonst wird er zu stark. Seine Kräfte wachsen jeden Tag und seine Armee wird immer großer. Pass auf dich gut auf und achte auf deine Umgebung.\n"
                            + "Stimme1:	Dein nächstes Ziel ist das Königreich Saurok. Dort musst du mit dem König reden und ihm überreden dir zu Hlfen.\n"
                            + "Du: Danke für eure Hilfe. Ich hoffe ich enttäusche euch nicht.\n"
                            + "Stimme3:	Wir werden es sehen\n";
//Saurok
     static String storyI3 = "*Die Zeit fängt wieder normal zu laufen. Du hörst wie Liam runter geht.*\n"  
                             + "Liam: Gehst es dir gut?\n";
     static String storyI4 = "(1) Sag Liam, dass es dir gut geht und, dass ihr nach Saurok reiten musst\n"
                            + "Du: Mir geht es gut. Wir mussen nach Saurok reiten um uns dort mit dem König zu treffen.\n"
                            + "Liam: Dann los geht´s\n";
     static String storyJ1 = "*Paar Tage später sind sie endlich in Sarouk. Auf dem Weg erzählte Liam, dir viele Geschichten aus seinem Leben. In dieser Zeit nährt ihr euch einander sehr.*\n";                        
     static String storyJ2 = "(1) frag Liam ob er die Stadt kennt.\n"                  
                            + "Du: Kennst du die Stadt?\n"
                            + "\n"
                            + "\n"
                            + "\n"
                            + "\n"
                            + "\n"
                            + "\n"
                            + "\n"

}