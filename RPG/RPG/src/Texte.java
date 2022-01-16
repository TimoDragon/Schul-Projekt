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
    String storyJ1, storyJ2, storyJ3, storyJ4, storyJ5, storyJ6;

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
        storyJ5 = player.getName() + "Lass uns weiter gehen. Wir müssen uns beeilen\n"
                + "    Wie schaffen wir es in das Schloss reinzukommen? Es stehen überall Wachen.\n"
                + "Liam: Wir müssen uns als Diener verkleiden. Wenn wir drin sind, müssen wir den Prinzen finden.\n"
                + "      Er kann uns sicher helfen.\n";
        storyJ6 = "(1) Sag ihm, dass du gerade 2 Diener siehst\n";
    }
}