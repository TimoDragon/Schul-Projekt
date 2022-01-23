public class Texte {
    Player player = new Player();

    //here are every Texts stored
    String randomNumber = "Gebe eine Zahl ein zum vortfahren\n";
    String choose = "\nWähle aus:\n";

    //after the game has started
    String start1 = "########################################################################\n";
    String start2 = "Willkommen in unserem Spiel\nGebe bitte deinen Namen ein, um zu starten\n";
    //after the game has started
    //prologue
    String prologue1, prologue2;
    //Story
    String story1, story2, story3, story4, story5, story6, story7, story8, story9, story10, story11;
    //hau ab ohne Gertrude bescheid zu sagen. Kannst entweder ein Messer oder eine Laterne wählen 
    String storyA1, storyA2, storyA1A, storyA1B, storyA1C;
    //Rede mit Gertrude über die Begegnung
    String storyB1, storyB2, storyB3, storyB4, storyB5, storyB6, storyB7, storyB8, storyB9, storyB10, storyB11, storyB12, storyB13;
    //hier gehts nach dem Abhauen/dem Gespräch weiter
    String storyC1, storyC2, storyC3, storyC4;
    //Nachdem Toni los geritten ist und schaut was im Busch ist (Laterne)?
    String storyD1;
    //Ohne Laterne?
    String storyD2;
    //Nachdem Toni los geritten ist und NICHT schaut was im Busch ist
    String storyE1;
    //nach dem Busch
    String storyF1;
    //der Kampf gegen den Mann (Option 1)
    String storyG1, storyG2;
    //der Kampf gegen den Mann (Option 2)
    String storyG3;
    //Nach dem Kampf
    String storyG4, storyG5, storyG6, storyG7, storyG8, storyG9, storyG10;
    //shoppen
    String storyG11, storyG12, storyG13;
    String storyH1, storyH2, storyH3, storyH4, storyH5;
    //der Kampf gegen die Meerjungfrauen
    String storyH6, storyH7, storyH8, storyH9, storyH10, storyH11, storyH12;
    //Toni geht die Treppen runter (Entweder fällt sie runter (ohne Laterne) oder nicht)
    String storyH13A, storyH13B;
    //Toni redet mit Stimmen
    String storyI1, storyI2, storyI3;
    //Saurok
    String storyI4, storyI5, storyI6;
    String storyJ1, storyJ2, storyJ3, storyJ4, storyJ5, storyJ6, storyJ7, storyJ8, storyJ9, storyJ10, storyJ11, storyJ12A, storyJ12B,
            storyJ13, storyJ14, storyJ15, storyJ16, storyJ17, storyJ18, storyJ19, storyJ20, storyJ21, storyJ22, storyJ23, storyJ24,
            storyJ25, storyJ26, storyJ27, storyJ28, storyJ29, storyJ30, storyJ31, storyJ32, storyJ33,storyJ34, storyJ35, storyJ36,
            storyJ37, storyJ38, storyJ39,storyJ40, storyJ41, storyJ42,storyJ43, storyJ44, storyJ45, storyJ46, storyJ47, storyJ48, storyJ49,
            storyJ50, storyJ51, storyJ51A, storyJ51B, storyJ52, storyJ53, storyJ54;

    public void setPlayer(Player player) {
        this.player = player;
    
        //prologue
        prologue1 = "************************* Vorgeschichte *************************\n";
        prologue2 = "Schon seit mehreren hundert Jahren kämpfen die Menschen gegen eine bösartige\n"
                                + "Macht, welche mit Orks, Trollen, Goblins und vielen anderen schreklichen Kreaturen\n"
                                + "zusammen Arbeitet. Als du 7 Jahre alt warst wurde dein Dorf durch Orks angegriffen und\n"
                                + "deine Eltern starben bei diesem Angriff. Mit den restlichen Überlebenden bist du in den\n"
                                + "Süden in das nahe gelegene Königreich gezogen und wurdest von einer alten Frau aufgenommen.\n";
        story1 = "*Du gehst durch die Stadt, ein Mann hählt dich auf*\n"
                                + "Akdov: Eyyyy… Warte… Du bist doch " + player.getName() + ", oder?\n" + choose
                                + "(1) Frage ihn wer er ist\n";
        story2 = player.getName() + ": Ja? Woher wissen Sie wie ich heiße? Und wer sind Sie überhaupt?\n";
        story3 = "Akdov: Ach ja. Entschuldige mich. Ich bin Akdov. Ich komme aus Teya.\n"
                                 + "       Wir können aber nicht hier stehen bleiben und reden. Die beobachten mich.\n";
        story4 = "(1) Frage ihn wer ihn beobachtet\n";
        story5 = player.getName() + ": Wer beobachtet Sie?\n"
                                + "Akdov: Ich erkläre dir gleich alles. Aber nicht hier. Kennst du ein Platz, wo es sicher ist?\n";
        story6 = "(1) Sage ihm er soll dir folgen\n";
        story7 = player.getName() + ": Ja, kommen Sie mit.\n*Ihr geht zu dem sicheren Ort*\n" + player.getName() + ": Jetzt können wir reden.\nAkdov: Wo soll ich anfangen?\n       Mhhh....\n       ch erzähle dir was über deiner Eltern\n";
        story8 = "(1) Sag ihm, dass du dich nicht an sie erinnerst.\n";
        story9 = player.getName() + ": Ich kann mich an die nicht so gut erinnern.\n";
        story10 = "Akdov: Vor langer Zeit kannte ich dein Vater. Wir waren befreundet. Brandon war der beste\n       Bogenschütze in dem ganze Lande. Ich weiß, dass er dir Bogenschießen beigebracht hat. Ich hoffe,\n       dass du nach seinem Tod weiter übtest.\n"
                                + "Er hat mir viel über dich erzählt.\n       Und deine Mutter. Sie war die liebste Person, die ich je kannte. Es tut mir so leid. "
                                + "       ...\n       Aa, ja ich wollte dir noch über die Prophezeiung erzählen.\n*Akdov hört schritte*\nAkdov: Los!\n       Hier, es hilft dir alle Antworten zu finden!\n       Jetzt lauf! Schnell!\n"
                                + "*Du nimmst die Karte und rennst weg. Akdov sagt einen Zauberspruch und verschwindet. Als du Zuhause ankommst öffnest du die Karte und schaust sie dir an. Ein Punkt erscheint dir.*\n";
        story11 = "(1) Gehe zum Makierten berreich auf der Karte\n(2) Erzähle Gertrude von dem Gespräch\n";
    
    
        //hau ab ohne Gertrude bescheid zu sagen. Kannst entweder ein Messer oder eine Laterne wählen 
        storyA1 = "*Du packst die nötigsten Sachen ein und wartest bis es dunkel ist. Auf dem Weg nach siehst du noch ein Messer und eine Laterne* Was nimmst du mit?\n";
        storyA1A = "(1) Messer\n"
                    + "(2) Laterne\n";
        storyA1B = "*Du packst das Messer ein*\n";
        storyA1C = "*Du packst die Laterne ein*\n";
        storyA2 = "*Du hörst schritte und läufst weg, Gertrude schreit.*\nGertrude: Wer ist da?\n*Du läufst aber weiter.*\n";
        
    
        //Rede mit Gertrude über die Begegnung
        storyB1 = player.getName() + ": Gertrude, ich muss mit dir reden.\nGertrude: Warte einen Moment liebe. Ich bin gleich da.\n*Du packst die nötigsten Sachen ein und hörst aufeinmal ein Klopfen.*\n"
                                + "Gertrude: Ich bin jetzt da. Was wolltest du mir erzählen?\n";
        storyB2 = "(1) Erzähle Gertrude von der Begegnung\n";
        storyB3 = player.getName() + ": Wo soll ich anfangen... Als ich auf dem Marktplatz war begegnete ich einen Mann.\n    Er erzählte mir, dass "
                                + "er meine Eltern kannte. Der Mann wollte mit auch etwas über meine Prophezeiung sagen aber das hat er\n    nicht mehr geschafft, da er von jemanden verfolgt wurde. Er hat mir aber eine "
                                + "Karte gegeben.\n*Du zeigst Gertrude die Karte*\n"
                                + "Gertude: Du weißt aber schon, dass die Karte leer ist?\n";
        storyB4 = "(1) Sag ihr, dass auf der Karte ein Punkt ist\n";
        storyB5 = player.getName() + ": Nein, schau doch mal hier. Da ist ein Punkt makiert.\n"
                                + "Gertrude: Ich sehe nichts auf der Karte, aber ich glaube dir. Was willst jetzt damit machen?\n";
        storyB6 = "(1) Sag ihr, dass du zum Punkt gehen wirst\n";
        storyB7 = "Gertrude: Du weißt aber das es Gefährlich sein kann. Hast du keine Angst?\n";
        storyB8 = "(1) Sag ihr, dass du trotzdem hingehen wirst\n";
        storyB9 = player.getName() + ": Ich habe nichts zu verlieren. Laut der Karte ist der makierte Berreich auch nicht weit weg. Ich nehme Troy\n    und reite dahin.\n"
                                + "Gertude: Okay, mach das. Brauchst du noch was?\n";
        storyB10 = "(1) Sage ihr, dass du eine Laterne und ein Messer brauchst\n";
        storyB11 = player.getName() + ": Ich könnte noch eine Laterne und ein Messer brauchen.\n"
                                    + "Gertrude: Hier nimm die Laterne und das Messer. Sicher ist sicher.\n*Gertrude gibt dir eine Laterne und ein Messer*\n";
        storyB12 = "(1) Verabschiede dich\n ";
        storyB13 = player.getName() + ": Danke und auf wiedersehen!\nGertrude: Auf wiedersehen und pass auf dich auf.\n";
    
        //hier gehts nach dem Abhauen/dem Gespräch weiter
        storyC1 = "*Du kommst an einenem Pferdestall an, wo dein Pferd namens Troy auf dich wartet.*\n";
        storyC2 = "(1) Begrüße Troy\n";
        storyC3 = player.getName() + ": Hi, großer, hast du Lust auf ein Abenteuer?\n*Du schreichelst Troy und steigst auf ihn drauf, du schaust auf die Karte und reitest los.\n"
                                + "Nach einer Welie ereichst du einen kleinen Wald. Plötzlich hörst du ein komisches Geräusch in den Büschen*\n";
        storyC4 = "(1) Du schaust nach was in dem Busch ist.\n(2) Du reitest weiter.\n";
    
        //Nachdem Toni los geritten ist und schaut was im Busch ist (Laterne)?
        storyD1 = "*Du siehst einen Hund, welcher sich erschreckt und wegrent. Du reitest weiter.*\n";
       //Ohne Laterne?
        storyD2 = "*Ein Hund springt auf dich zu und beißt dich. Du verlierst 5 HP. Du reitest weiter.*\n";
    
        //Nachdem Toni los geritten ist und NICHT schaut was im Busch ist
        storyE1 = "*Du reitest weiter.*\n";
    
        //nach dem Busch
        storyF1 = "Du zu Troy: Ich glaube wir sind bald da.\n"
                                + "*Auf einmal siehst du einen Mann mit einem Messer.*\n"
                                + "Dieb: Wieso bist so spät noch unterwegs?\n"
                                + "*Du antwortest nicht.*\n"
                                + "Dieb: Was versteckst du da?\n"
                                + "*Der Dieb reißt dir deinen Rucksack von deinem Rücken und schmeißt alle Sachen auf den Boden\n"
                                + "Er sammelt heruntergefallene Gold Stücke auf.*\n";
    
        //der Kampf gegen den Mann (Option 1)
        storyG1 = "*Du nimmst ein Messer in die Hand und sprintest auf den Mann zu.*\n";
        storyG2 = "(1) Greif den Dieb an\n";
        //der Kampf gegen den Mann (Option 2)
        storyG3 = "*Du guckst dem Mann an. Der Mann fängt an in Richtung Troy zu gehen*\n"
                                +"Dieb: Für dem kriege ich mindestens 50 Gold Stücke.\n"
                                + "*Du kriegst Angst und weiß nicht was du machen sollst. Du siehst deine Laterne . Gehst hinter dem Dieb und schalgst ihm. Er wird sauer.*\n";
        
        //Nach dem Kampf
        storyG4 = "*Plötlich kommt ein großer Mann, welcher den Dieb verjagt. Er hilft dir aufzustehen.*\n";
        storyG5 = "(1) Frag ihn, wer er ist\n";
        storyG6 = player.getName() + ": Danke! Wer bist du?\n"
                                + "...: Ich bin Liam. Mir wurde gesagt, dass ich dir helfen soll also komm mit kleine.\n"
                                + player.getName() + ": Hi\n"
                                + "Liam: Hi\n"
                                + "*10 Minuten später stehen du und Liam vor einem Haus, ihr geht rein\n*"
                                + "Liam: Akdov hat einen Bogen für dich hier gelassen. *Liam gibt dir einen Bogen*\n";
    
        storyG7 = "(1) Begutachte den Bogen\n";
        storyG8 = player.getName() + ": Der ist Wunderschön. *Du spannst den Bogen und lässt los. Ein Pfeil erscheint aus dem Nichts und schießt quer durch den Raum.\n*"
                                + "Liam: Willst du micht umbringen? *lacht*\n";
        storyG9 = "(1) Erzähle Liam von der Prophezeiung.\n";
        storyG10 = player.getName() + ": Akdov hat mir von einer Prophezeiung erzählt.\n"
                                + "Liam: Er hat mir nichts darüber erzählt. Er sagte aber, dass ich mir dir zum nächsten makierten Berreicht auf der Karte hin gehen soll.\n"
                                + "*Du gehst in einen Laden.*\n";
    //shoppen
    
        storyG11 = "*Nächster Tag.*\n" 
                                + "Liam: Aufstehen!\n";
        storyG12 = "(1) Sag Liam, dass er dich in ruhe lassen soll.\n";
        storyG13 = player.getName() + ": Gleich.\n"
                                + "Liam: Wir mussen los laufen. Komm nach unten. Ich mach dir was zum Essen.\n"
                                + player.getName() + ": Jaaa. Ich ziehe mich noch schnell um.\n"
                                + "*Liam guckt Toni an.*\n"
                                + player.getName() + ": Geh bitte raus! *lacht*\n"
                                + "*Liam guckt dich böse an und geht raus.*\n";
        storyH1 = "*10 minuten später.*\n"
                                + "*Du gehst nach unten, isst dein Frühstück und ihr fährt los.*\n"
                                + "*Nach 3 Stunden Weg, steht ihr vor einem See.*\n";
        storyH2 = "(1) Frag wie ihr auf die Insel kommt.\n";
        storyH3 = player.getName() + ": Wollen wir durch der See schwimmen.\n"
                                + "*Du läufst in Richtung des Wassers.*\n"
                                + "Liam: NEIN!\n"
                                + "*Aufeinmal fängt was dein Bein und zieht dich in das Wasser rein.*\n"
                                + "*Liam läuft in deiner Richtung und schneidet die Hand ab.*\n";
        storyH4 = "(1) Frag Liam, was das war.\n";
        storyH5 =  "Wa... Was war da?\n!"
                                + "Liam: Eine Meerjungfrau. Die sind schrecklich.\n"
                                + "Liam: Wir müssen ein Floß bauen.\n"
                                + "*Ihr geht zum Wald und sammelt Stocke. Liam erzählt dir über seiner Kindheit. Das Floß ist fertig*\n"
                                + "*Ihr schwimmt durch den See*\n";
        //der Kampf gegen die Meerjungfrauen
    
        storyH6 = "*Du umarmst Liam*\n"
                                + player.getName() + ": Wir haben uberlebt!\n"
                                + "Liam: Komm, Wir müssen weiterlaufen.\n"
                                + "*Die beiden sehen ein großes, altes Haus.*\n"
                                + player.getName() + ": Ich hoffe wir sind hier richtig.\n"
                                + "*Liam öffnet lagsam die Tür. Sie durchsuchen zusammen das Haus.*\n"
                                + player.getName() + ": Hier ist nichts.\n"
                                + "Liam: Vielleicht ist hier ein Geheimraum.\n"
                                + player.getName() + ": Wonah soll ich suchen?\n"
                                + "Liam: Lass die Bücherregalen durchsuchen.\n";
        storyH7 = "(1) Fang an die Regalen durchzusuchen.\n";
        storyH8 = player.getName() + ": Wonach soll ich suchen?\n"
                                + "Liam: Lass die Bücherregale durchsuchen.\n";
        storyH9 = "(1) Fang an die Regalen durchzusuchen.\n";
        storyH10 = player.getName() + ": Liam! Ich habe was gefunden! Hier. Das Buch kann man nicht Bewegen.\n"
                                + "*Liam zieht das Buch. Ein Regal öffnet sich.*\n";
        storyH11 = "(1) Geh gucken wo das Weg führt.\n";
        storyH12 = player.getName() + ": Hier sind Treppen. Die führen nach unten.\n"
                                + "*Du gehst langsam nach unten. Das Regal schließt sich.*\n"
                                + player.getName() + ": Liam!! Hörst du mich!\n"
                                + "Liam: Ich kann es nicht öffnen! Du kannst aber weiter gehen! Ich komme so schnell wie es geht\n";
    //Toni geht die Treppen runter (Entweder fällt sie runter (ohne Laterne) oder nicht)
        storyH13A = "*Du fällst die Treppe runter, da du nicht sehen kannst wohin du trittst*\n"
                                    + "*Du verlierst 10 Leben*";
        storyH13B = "*Du packst deine Laterne aus und Läufst die Treppe runter*";
    
    //Toni redet mit Stimmen                            
        storyI1 = "*Du bist in einem alten, staubigen Zimmer in einem Keller. Das Zimmer ist voll mit alten Büchern und in der Mitte ist ein Podium. Du gehst näher dran. Auf dem Podium liegt ein großes, altes Buch.\n";
        storyI2 = "(1) Öffne das Buch.\n";
        storyI3 = "Die Seiten bewegen sich. Durch dem Zimmer fliegen Bücher. Der Zeit stoppt. Eine Lichtquelle zeigt auf dich. Du hörst auf einmal Stimmen.*\n"
                                + "Stimme1:	Das ist unser Held\n"
                                + "Stimme2:	" + player.getName() + " wird uns retten\n"
                                + "Stimme3:	Glaube ich nicht\n"
                                + "Stimme3:	Wie hast du, die Meerjungfrauen überlebt?\n"
                                + "Stimme2:	Ist doch nicht so wichtig\n"
                                + "Stimme1:	Zurück zu Sache. Du hast uns gefunden. Wir warteten 467 Jahren auf dich\n"
                                + "Stimme3:	Zu viele Jahren\n"
                                + "Stimme2:	Kannst du bitte deine Kommentare weglassen\n"
                                + "Stimme3:	Uhh\n"
                                + "Stimme1:	Wir sind hier, um dir die Prophezeiung zu erzählen.\n"
                                + "Stimme1: Paar Jahre vor dem Krieg hatten wir eine Vision. Uns würde gezeigt, was passieren wird. Die bösartigen Mächte vermehrten sich langsam und fangen an das Land zu übernehmen. Viele gute Kreaturen werden in Kriegen sterben. Keiner könnte es verhindern. Wir haben aber auch gesehen, dass an einem gewitterigen Tag, unsere Heldin geboren wird. An dem Tag hat auch für kurz die Sonne geschient und für ein kleines Moment war alles wieder normal. Deine Eltern haben dich von dem bösen König versteckt. Er hat euch aber nach paar Jahren gefunden. Er wollte dich umbringen als du klein warst, damit du ihm später nicht umbringen kannst. Deine Eltern haben es aber nicht zugelassen und haben sich für dich geopfert. Dein Schicksal ist es, ihn zu töten.\n"
                                + player.getName() + ": Ich weiß aber nicht, wie ich es machen soll und ob ich es schaffe.\n"
                                + "Stimme2:	Akdov hat dir doch eine Karte gegeben. Die Punkte zeigen dir Plätze, wo du Leute findest, die dir helfen werden. \n"
                                + "Stimme1: Es wird schwer, wir glauben aber an dich!\n"
                                + "Stimme3: Wer glaubt, der glaubt!\n"
                                + "Stimme1:	Hör nicht auf ihm.\n"
                                + "Stimme2:	Bevor du gehst. Der Zeit ist bald um. Du musst ihm so schnell wie möglich töten. Sonst wird er zu stark. Seine Kräfte wachsen jeden Tag und seine Armee wird immer großer. Pass auf dich gut auf und achte auf deine Umgebung.\n"
                                + "Stimme1:	Dein nächstes Ziel ist das Königreich Saurok. Dort musst du mit dem König reden und ihm überreden dir zu Helfen.\n"
                                + player.getName() + ": Danke für eure Hilfe. Ich hoffe ich enttäusche euch nicht.\n"
                                + "Stimme3:	Wir werden es sehen\n";
    //Saurok
         storyI4 = "*Die Zeit fängt wieder normal zu laufen. Du hörst wie Liam runter geht.*\n"  
                                 + "Liam: Gehst es dir gut?\n";
         storyI5 = "(1) Sag Liam, dass es dir gut geht und, dass ihr nach Saurok reiten musst\n";
         storyI6 = player.getName() + ": Mir geht es gut. Wir mussen nach Saurok reiten um uns dort mit dem König zu treffen.\n"
                                + "Liam: Dann los geht´s\n";
         storyJ1 = "*Paar Tage später sind sie endlich in Sarouk. Auf dem Weg erzählte Liam, dir viele Geschichten aus seinem Leben. In dieser Zeit nährt ihr euch einander sehr.*\n";                        
         storyJ2 = "(1) frag Liam ob er die Stadt kennt.\n";                  
         storyJ3 = player.getName() + ": Kennst du die Stadt?\n"
                                + "Liam: Ja, ich war hier zwei- oder dreimal. Die Stadt ist sehr schön und romantisch *lacht*\n"
                                + "...\n"
                                + "Wächter Wachmann: Wer seid ihr? Und was wollt ihr?\n"
                                + player.getName() + ": Hi. Mein Name ist " + player.getName() + " und das ist Liam. Wir müssen dringend mit dem König reden.\n"
                                + "Wächter Wachmann: Wir lassen Fremde nicht rein!\n"
                                + "Wächter Schlafmann: Liam? Mein alter Freund. Gut dich wieder zu sehen!\n"
                                + "*Die beiden umarmen sich*\n"
                                + "Wächter Schlafmann: Tom. Lass die rein. Mit dem habe ich früher verrückten Dinge gemacht.\n"
                                + "                    Erinnerst du dich noch an diese Nacht in Pub? *lacht*\n"
                                + "Liam: Ja, ja...\n"
                                + "Wächter Schlafmann: Lass ihn und seinen Begleiter rein. Ich schwöre dir, die kommen zu guten Zwecken\n"
                                + "                    Geht rein, aber falls jemand fragt, kennt ihr mich nicht.\n"
                                + "Liam: Klar!\n"
                                + "*Liam und " + player.getName() + " gehen in die Stadt. Auf den weg zum Schloss stößt dich ein alter Opa ausversehen um*\n"
                                + "Opa Bauland: PASS AUF WOHIN DU LÄUFST! MEINE GANZEN SACHEN LIEGEN AUF DEM BODEN!\n"
                                + "Liam: Sch...\n"
                                + "Opa Bauland: NICHT SCHULDIGUNG! DU WIRST FÜR ALLES BEZAHLEN!\n"
                                + "*Liam nimmt " + player.getName() + "'s Hand und rennt weg*\n"
                                + "Opa Bauland: KOMMT ZURÜCK!\n"
                                + "Liam: Wir haben es geschaft *lacht*";
        storyJ4 = "(1) Sag ihm, dass wir weiter laufen sollten\n";
        storyJ5 = player.getName() + ": Lass uns weiter gehen. Wir müssen uns beeilen\n"
                + "    Wie schaffen wir es in das Schloss reinzukommen? Es stehen überall Wachen.\n"
                + "Liam: Wir müssen uns als Diener verkleiden. Wenn wir drin sind, müssen wir den Prinzen finden.\n"
                + "      Er kann uns sicher helfen.\n";
        storyJ6 = "(1) Sag ihm, dass du gerade 2 Diener siehst\n";
        storyJ7 = player.getName() + " Ich sehe zwei Diener dort. *du zeigst auf die Diener*\n"
                + "Liam: Wir müssen sie betäuben.\n";
        storyJ8 = "(1) Frag ihn, wie ihr die Diener betäuben sollt\n";
        storyJ9 = player.getName() + ": Wie sollen wir die betäuben?\n"
                + "Liam: Mach mir nach.\n"
                + "*Liam läuft leise hinter einen Diener und erwürgt ihn. " + player.getName() + " will das gleiche machen aber der Diener bemerkt " + player.getName() + " und greift an*\n";
        storyJ10 = "Liam: Geht es dir gut?\n";
        storyJ11 = "(1) Sag das es dir Gut geht\n"
                    + "(2) Sag das es dir nicht Gut geht\n";
        storyJ12A = player.getName() + ": Ja, mir geht es gut.\n"
                    + "Liam: Okay, gut.\n";
        storyJ12B = player.getName() + ": Nein, mir geht es nicht gut.\n"
                    + "*Liam Verarztet " + player.getName() + ". Du erhälst 25 Leben. Liam und " + player.getName() + " ziehen\n"
                    + "deren Diener Klamotten an und gehen in das Schloss*\n";
        storyJ13 = "(1) Frag wo es lang geht";
        storyJ14 = player.getName() + ": Wo lang jetzt? Das Schloss ist sehr groß. Weißt du, wo wir ihm finden?\n"
                    + "Liam: Ich werde in sein Zimmer gehen und du könntest auf dem Trainings Platz nachschauen.\n";
        storyJ15 = "(1) Begib dich auf den Weg\n";
        storyJ16 = player.getName() + ": Ok, mach ich.\n"
                + "*" + player.getName() + " sucht einen Weg nach draußen. Auf dem weg hört " + player.getName() + " ein Gespräch*\n"
                + "Frauen Stimme: Denkst du das er es nicht bemerkt\n"
                + "Männer Stimme: Nein. Er ist zu blöd. Außerdem kriegt er nur ein paar Tropfen von der Mixtur. Glaub mir, er bemerkt es nicht.\n"
                + "Frauen Stimme: Ich habe dich leib Kail. Lass uns morgen hier wieder treffen.\n"
                + "Kail: Ich dich auch. Bis Morgen.\n"
                + "*Der Mann geht aus der Küche raus*\n"
                + "Kail: Wieso stehst du hier so? Hast du was gehört?\n";
        storyJ17 = "(1) Sage, dass du nichts gehört hast\n";
        storyJ18 = player.getName() + ": Nein, nein ich nicht. Ich gehe jetzt weiter arbeiten.\n"
                    + "Kail: Ich hoffe!\n"
                    + "*" + player.getName() + " geht nach draußen und sucht Prinz Marcus weiter. Auf einmal sieht " + player.getName() + " einen Junge Mann*\n";
        storyJ19 = "(1) Frage ihn, ob ehr Marcus ist\n";
        storyJ20 = player.getName() + ": Bist du Marcus?\n"
                    + "Marcus: Prinz Marcus!\n";
        storyJ21 = "(1) Entschuldige dich\n";
        storyJ22 = player.getName() + ": Es tut mir leid ihre Hoheit.\n"
                + "Marcus: Entspann dich ein bisschen. *lacht*\n"
                + "        Du kannst mich Marcus nennen und… wer bist du?\n";
        storyJ23 = "(1) Sag ihm, wie du heißt\n";
        storyJ24 = player.getName() + ": Ich heiße " + player.getName() + ". Ich bin hier mit Liam.\n"
                + "Marcus: Liam, mein alter Freund. Ich freue mich ihm wieder zu sehen.\n";
        storyJ25 = player.getName() + ": Ich sehe er hat hier viele Freunde. Und er meinte das er hier nur dreimal in sein Leben war.\n";
        storyJ26 = "Marcus: Woher kennst du Ihm?\n";
        storyJ27 = "(1) Antworte den Prinz auf seine Frage\n";
        storyJ27 = player.getName() + ": Es ist eine lange Geschichte.\n"
                + "* Auf einmal kommt Liam ins Schloss * \n"
                + "Liam: Mein alter Freund.\n"
                + "*Liam umarmt Marcus*\n"
                + "Marcus : Was bringt euch hier?\n";
        storyJ28 = "(1) Erzähle Marcus dein anlegen.\n";
        storyJ29 = player.getName() + ": Wir müssen dringend mit dein Vater reden!\n"
                + "Marcus: Das geht leider nicht. Mein Vater ist krank geworden.\n" 
                + "        Kein Arzt kann ihm helfen.\n"
                + "        Er redet immer von Elfen. Dass die Lügner sind.\n"
                + "        Er will eine Armee auf die schicken.\n "
                + "        Ich weiß nicht, wie ich ihm aufhalten soll.\n";
        storyJ30 = "(1) Hast du etwas gehört?\n";
        storyJ31 = player.getName() +  ": Ich habe was in der Küche gehört.\n"
                   + "     Ein Mann namens Keile hat mit einer Frau geredet.\n"
                   + "     Die sagten was über eine Mixtur und das einer das nicht bemerken will.\n";
        storyJ32 = "Liam: Dein alter Brunder?\n"
                + "Marcus: Hmmm... Wieso will er unseren Vater vergiften? \n";
        storyJ33 = "(1) Frag den Prinzen wer der das Reich den führen würde?\n";
        storyJ34 = player.getName() + ": Wer wird das Königreich leiten, nach dem Tod deines Vaters?\n"
                + "Marcus: Keil.\n"
                + "Liam: Er wollte schon immer ein König werden.\n"
                + "      Aber dein Vater wollte es dir überlassen.\n" 
                + "      Wie halten wir ihm auf?\n"
                + "Marcus: Erstens müssen wir die Mixtur finden und mein Vater ein Heilmittel erstellen. \n"
                + "Liam: Was machen wir mit Keil?\n"
                + "Marcus: Wir gucken später erst müssen wir die Mixtur finden.\n"
                + "        Ich kann euch aber nicht dabei helfen. Ich pass auf Keil auf,\n"
                + "        damit er euch nicht stört.\n";
        storyJ35 = "(1) Geh mit Liam in die Küche\n";
        storyJ36 = player.getName() + ": Ja klar.\n"
                + "*" + player.getName() + "und Liam gehen in die Küche*\n";
        storyJ37 = "(1) Durchsuche die Küche zusammen mit Liam.\n";
        storyJ38 = player.getName() + " : Wo können wir uns verstecken? \n"
                + "* " +  player.getName() + "fängt an den Raum nach einen Versteck zu druchsuchen *\n"
                + "Liam : Er ist nicht dumm. Wir finden es nicht so schnell. Vielleicht… \n";
        storyJ39 = "(1) Weiss Liam auf das Bild hin.\n";
        storyJ40 = player.getName() + "Guck mal. Das Bild da drüben hängt ein bisschen schief!\n"
                + "* Liam hebt das Bild hoch *\n"
                + "Liam : Ein geheim Versteck. Das ist sein Stil.\n"
                + "* Liam nimmt die Phiole und liest was da draufsteht *\n"
                + "Liam : Hyoscyamus. Die Symptome sind Unruhe, Halluzinationen, Bewusstlosigkeit.\n";
        storyJ41 = "(1) Frag liam was das Heilmittel ist. \n";
        storyJ42 = player.getName() + " : Was ist das Heilmittel? \n"
                + "Liam : Es gibt eine Pflanze, die helfen kann. Symphytum officinale. Du musst zu dem Wald gehen und die Wurzeln sammeln. Ich werde mit Marcus reden. \n"
                + player.getName() + " : Klar!\n";
        storyJ43 = "(1) Reite zum Wald\n";
        storyJ44 = "* "+ player.getName() + " reitet zu dem Wald. Als "+ player.getName()+" in der nähe ist fühlt "+ player.getName() +" sich beobachtet."+ player.getName() +" sieht die Pflanze und sammelt ein paar Wurzeln. Als " + player.getName() +" zurück gehen will sieht " + player.getName()+" drei Orks.\n"
                + "Der erste Ork : Hier ist jemand ich fühle es!\n"
                + "Der zweite Ork : Komm raus! Wir werden dich finden. Und später essen wir dich!(lacht) \n";
        storyJ45 = "(1) Vertecke dich hinter einem Baum\n";
        storyJ46 = "* " + player.getName() + " fühlt sich umwohl und versteckt sich im Baum *\n"
                + " dritte Ork: Thorgk, Hurghaash, da lang! \n"
                + "* und zeigt in " + player.getName()+ " Richtung * \n "
                + "Thorgk : Komm raus, komm raus wo immer du bist! \n";
        storyJ47 = "(1) Spann den Bogen\n";
        storyJ48 = "* " + player.getName()+ " spannt den Bogen *\n"
                + "* " + player.getName()+ "hört annähernde sich Schritte. Deckt sich hinter dem Baum und schießt ins Thorgks Auge *\n"
                + "Thorgk : Ey eine Person hat mein Auge getroffen. Ich sehe nichts mehr!\n";
        storyJ49 = "*  Orks werden sauer und laufen in" + player.getName()+ "s"+ " Richtung *\n";
        storyJ50 = "(1)" + player.getName() + "kämpft gegen die Orks.\n";
        storyJ51A = "* Hurghaash hebt dich hoch, zieht deine Zunge raus und hängt die in seiner Kollektion. Die Orks gucken wie du langsam verblutest und lachen dabei. *\n";
        storyJ51B = "(2)" + player.getName() + " flieh und reite weriter\n ";
        storyJ52 = "* " + player.getName() + "reitet mit dem Heilmittel in richtung der Schloss und flieht von dem Orks *\n"
                 + "(1) Du siehst Liam. \n"
                 + player.getName()+ " : Liam !/n"
                 + "* " + player.getName() + " umarmt ihn *\n"
                 + "Liam : Was ist passiert \n?"
                 + player.getName() + " : Die Orks .... Sie waren da, im Wald.\n " 
                 + "Liam : Wie viele waren es ?\n"
                 + player.getName() + " : 3 Stück.\n "
                 + "Einen habe ich ins Auge geschossen, dann bin ich geflohen.\n"
                 + "Liam : Es kann sein, dass noch mehr kommen. Wir müssen Marcus bescheid sagen.\n"
                 +"(1) Gebe Liam die Wurzel.\n"
                 + player.getName()+ " : Hier.\n"
                 + "* " + player.getName() + " gibt Liam das Heilmittel *\n"
                 + "Liam : Danke, ich bin stolz auf dich.\n"
                 + "* " + player.getName() + " lächelt *\n"
                 + "* Später am Tag*\n"
                 + "* Liam trifft endlich auf Prinz Marcus *\n"
                 + "Marcus: Wir haben jetzt ein Heilmittel. Lass so schnell wie möglich zu meinem Vater gehe.\n"
                 + "Keil : Nicht so schnell!\n"
                 + "*Keil lacht *\n"
                 + "Keil : Hat euch das Essen geschmeckt?\n"
                 + "* Marcus und Liam gucken sich verblüft an *\n"
                 + "* Liam und Marcus drehen sich um *\n"
                 + "Liam : Was hast du uns gegeben?\n"
                 + "Keil : Das Mittel paralysiert langsam dein Körper, ihr könnt euch gleich nicht mehr bewegen, reden nur zuschauen wie der König stirb.\n"
                 + "Marcus : Das ist unser Va... \n"
                 + "* " + player.getName() + " tauch plötzlich auf *\n"
                 +"(1) Mach auf dich Aufmerksam\n"
                 + player.getName() + " : Was hat du gemacht Keil !? \n"
                 + "Keil : Oh. Du lebst noch. Ich dachte meine Orks haben dich getötet.\n"
                 +"(1) Antworte Keil\n"
                 + player.getName() + "(lacht) Man kann mich nicht leicht umbringen!\n"
                 + "* " + player.getName() + " nimmt das Schwert in die Hand und setzt zum Angriff an *\n"
                 + "* Keil schmeist "+ player.getName() + " zu Boden *\n"
                 + "Keil : Komm schon steh auf und Kämpf.\n"
                 + "(1) steh auf\n"
                 + player.getName()+ " probiert es nochmal.\n";
        storyJ53 = "(1) Du greifst Keil unüberlegt an\n"
                 + "Keil ist stärker als du. Langsam hast du kein Kraft mehr. Er sieht es und als du nicht mehr aufmerksam bist schneidet er dein Kopf ab. Du siehst noch, wie er Liam und Marcus töte.\n";
        storyJ54 = "(2) Du denkst dir eine Strategie aus, du greifst Keil mit einer guten Taktik an \n"
                 + "* "+ player.getName()+ " besiegt Keil\n"
                 + "* Keil gibt auf *\n"
                 + "(1) droh Keil"
                 + player.getName() + " Bleib da. Keine Bewegung mehr.\n"
                 + "* Marcus und Liam fangen an langsam zu reden * \n "
                 + "Marcus : Ich dachte, dass man dich nicht beseitigen kann, Keil. Du warst immer der bester, aber hast min einem Mädchen verloren.\n"
                 + "* Auf einmal kommt ein schwarzer dampf in das Zimmer rein. *\n"
                 + "Eine geheimnisvolle Stimme: Du hast meinem besten Kämpf er beseitigt. Ich bin beeindruckt.Jetzt muss ich aber weg.\n"
                 + "* Der Dampf verschwindet und Keil mit ihm *\n"
                 + "Liam : Wo ist er hin? \n"
                 + player.getName() + " : Die frage ist, was war das für eine Stimme?\n"
                 + "Marcus : Lass das später besprechen. Erst müssen wir mein Vater retten. \n"
                 + "* Alle laufen in das Königliche Schlafzimmer *\n"
                 + "Marcus : Vater hier trink das. \n"
                 + "* Der König trinkt den Heiltrank * \n"
                 + "(1) sprech mit Marcus \n "
                 + player.getName() + " : Ich hoffe, dass ihm wieder besser geht. Ich habe aber noch eine Sache, die ich mit dir besprechen muss, Marcus.\n"
                 + "Marcus : Ich höre.\n"
                 + "(1) Bitte Marcus um Hilfe \n"
                 + player.getName() + " : Wir sind hier gekommen, um euch zu sagen, dass wir Hilfe brauchen.Die bösen Mächte waschen. Orks, Goblins, Trolls… alle vermehren sich.\n"
                 + "Wir brauchen eine Armee, um die zu beseitigen und die Frage ist, ob ihr mit uns Kämpfen wird?\n"
                 + "Marcus : Das was du für mein Vater gemacht hast, für mich. Wir werden euch sicher Helfen. Ich bereite eine Armee vor.\n"
                 + "(1) Bedank dich bei Marcus\n"
                 + player.getName() + " : Danke, dass bedeutet sehr viel für mich. Wir werden dir bald mehr Informationen schicken.\n"
                 + "Marcus : Was wollt ihr jetzt machen?\n"
                 + "(1) Erzähle Marcus was du vor hast \n"
                 + player.getName() + " : Wir besuchen die Elfen. \n"
                 
       
    }
}