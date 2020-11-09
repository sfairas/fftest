package sfairas.test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import sfairas.test.basetypes.StatType;

@SpringBootApplication
public class FeefoTestApplication {

  
  public static void main(String[] args) throws IOException {
    // ####### problem 1 #######
    String jt = "Java engineer";
    Normaliser n = new Normaliser();
    String normalisedTitle = n.normalise(jt);
    System.out.println(jt+": "+normalisedTitle);
    
    jt = "C# engineer";
    normalisedTitle = n.normalise(jt);
    System.out.println(jt+": "+normalisedTitle);
    
    jt = "Chief Accountant";
    normalisedTitle = n.normalise(jt);
    System.out.println(jt+": "+normalisedTitle);
    
    // ####### problem 2 #######
    ArrayUtils arrayUtils = new ArrayUtils();
    //int [] intArray = {-13,2,5,6,8,10,38,38,100,234,563,673,100, 9247};
    int [] intArray = {415832974, -2108447870, 627601615, 647060741, -28036307, 1793245810, -1803963801, -965415946, 818351242, 263242680, -1948289803, -2123404632, -101795950, 1700008151, 1929773783, -2132493635, -286595200, -1693180854, -1439196367, 552014787, -1832094884, -1316179531, 1881427988, -1110118268, 1736235716, 188323165, 1971790556, -849871461, -451751186, 702031578, 1305871064, -280240822, 1601445868, 540277514, 983601712, -466824053, 1231371826, -271670967, -1424239357, 136033636, -148135851, 337774558, 1620520655, 1149606527, 2045740309, -1790954569, 1299796502, 1683179513, 609659293, -930463911, -1389754819, 1886209402, 10574856, 1130616081, 1513613238, -1583413883, -47730137, -1066952593, 1264027233, -1967870448, -575870847, -688639244, 1103857199, 928274007, 1658531226, 1580267530, -627333624, 46976492, 1704615288, 1394889780, 1241174254, 455164178, 1847095650, -1134199931, 1536859490, -784708020, 780314602, -1600779434, -710091002, -1533386448, 467314990, -26766542, -449171837, 545023616, -2075972774, 1220294933, -1015116884, 790703482, 500423536, 649129174, -1419018781, 528550510, 1136430667, -1051533600, 2122405563, -1361277295, 1568407008, 1453927976, 120027871, -2080347887, 762222279, -422117030, -1496984271, -1967274647, -1254221319, -609648811, -580921290, -195446027, -1207757093, 2015910618, -1986809424, -1832148536, -1619689093, -1812535937, -119106420, 701194429, 731506968, -1061233175, -76464898, -684848948, 523047655, 96300345, -1450306838, 488657310, 1458044180, 572393414, -2007200123, 2041826146, -221082106, -111794931, 1090765628, -114501151, 2138797031, -663747867, 1490564308, 1355599056, 894433379, -2023626762, -735618350, -541808284, 1186385071, 695376235, -1666353636, 1479702828, -297987636, 1384314854, -35611425, -963366374, 492118284, 673183668, -964288333, 2025360354, -1239754539, 331311169, 1052095229, -733522297, -2021035612, 1522351822, 1707076501, 637543985, 2144018260, -1210689440, -89909849, -1406703548, -469040480, -600250629, -165976354, -1375259217, -860475674, 185728528, 83756222, 200963713, -1600075731, 84079155, -1893172143, -607245631, 223378793, 1482719248, 542019589, -173151106, -956439811, 1120464543, -141393964, -1148322012, -1275956864, 1874698390, -695849051, 1633058833, -1795085117, -1983919841, 1118687218, -466056089, -1942735085, 1060583371, -1812861782, 483356707, 1672074426, -1251643451, -924252585, -1489161618, 1027580876, -1995014582, -37807741, 261296947, 2018708511, 1105478744, -33310632, -322187791, 2043292570, 1224222629, 319658630, -1834568239, 2080948914, 42098386, 1647101801, 1343225594, 1151919410, 148720864, -976044439, -306984668, 1023898426, -590962717, -1922416220, 1142865771, -584016247, -1098963212, 1594795722, 1403543909, 247005182, 457020267, 518836809, -1483716234, 1523843419, -932210354, 806764713, -361167774, -1799315636, -1643633917, 741392952, 838880803, -1145976921, 1238404173, -923546391, -2099394564, 99080181, 178133109, -1508996999, -1813087283, 772079665, 1923880903, 706738386, -1507540823, -67203633, 527331392, 203221684, -155626331, -1465294081, 976715140, 773162642, -1988902926, -1241506254, 2068282389, -1324962375, -944941778, 2066068957, -1349848126, -1249802825, 1192452854, 1242532988, 2075186524, -994716166, 1583508159, 1508786393, 1285046192, -149808202, 2006806758, -1524842867, 1352736688, 1400272908, 467778052, -1882107193, -1502994445, -1306141592, -433550969, 1581566283, 121215839, 1802705194, 357414269, 1774179774, 1828095779, -371346808, -1546968141, 1413434656, 410093547, -1540579406, 973505534, -1503399016, -334649777, 1012095030, 806345688, -1016405385, -69511541, 1439683493, 713340718, -1355298186, 640665461, -537501833, -986377609, 55219778, 1508748459, -393580757, -1570483704, -1525796550, 827586571, -816723278, 408017574, 1652979319, -1132841369, -968769779, 1834622812, -700478452, -1259764871, -1313065676, 112867471, -1463734642, 121391380, -1555246279, 1544378447, 149729494, 1201552796, -1649112147, -1153650705, -1647004667, -1784064584, 85212994, -1827693865, 537517000, -223109819, -403876687, -820829545, -1773665572, -1771230323, 666462942, -613601216, 103003092, 1340909240, -800552647, -878641425, 1829759514, 540805762, -1507364250, 1368368041, 1964007219, -1906399698, 71695647, 995671662, -2098403258, -2031843910, -1842374823, -328423288, 637446110, 699316819, -1666820187, 694334499, 1408767982, -1429522934, -57458471, -600092382, 831860757, 1183198920, 1917098991, -1998640337, -198104029, 1480211583, 1193118764, -1389783788, -334252324, 1984407202, 1684554116, 2111690057, 1277132027, 1328452822, -47289028, 1875650509, 1437101177, 458168041, 1896996049, -345732808, 1054352398, 932001795, 1499029272, -431841519, 1265325816, -968453862, 1308907430, -81833635, -84203270, -1729491285, 284796017, -632690313, 28427943, -1403396698, -2020820553, -1936471514, -1736852000, -397757527, 2027821086, 1303844076, -190063974, -984422799, 139100444, -1695428452, -851997724, -510720372, -1737585256, 739534127, 1753093416, 938013011, 1400539857, -1311014698, -220655696, -1385591273, 1257030014, -2124760494, -968294292, 2043456154, -1450800329, 2059306115, -799996431, -938366271, 548592147, -16693441, -1613700411, -264568954, -992274799, 1167634789, -1711347751, 941201715, 1284601787, -975333327, -407403690, -316618548, -616154744, 826406864, 1668315036, 1746027724, -1951443582, 9300279, -126222714, -1676065516, 375431592, 1083547951, -837264141, -521737696, -1601406572, -681063244, 1487186562, -774806661, -1010608672, 991223424, 411816348, 907708789, -1408567866, -1406852639, -957412426, -1214652910, 336330502, -1327716653, -770089513, -1336858300, 1772042252, 1489591114, -47064744, -63822755, 1576124497, -620173874, 1590338794, -1513166658, 369748737, 1652102477, -982969891, -1978264108, -2131976227, 1524562476, 673399199, -69803451, -1841469854, -1371669346, 1882464130, -1025995675, 825327403, 190415929, -819023167, -15475218, 642822035, 1257309382, 2022051012, -430655760, -1392204898, 837780568, -189835358, -1670065146, 581044760, 1355083423, 611829992, -1681898550, -1717252354, 1555089789, 880835736, 120012682, 2139822109, -1406460198, 1064205428, -1981260997, -1940854791, 621916084, -1048742020, 60375213, -2042066193, -418593671, -1643647564, -1960613376, 304755357, -536858984, -1484794839, 1655541590, 2146919297, -1466806443, -125897418, 1354873801, -537585440, -48482340, 424055043, -1282720353, 1640612584, -1326238055, -864419250, 956753340, 821723928, 2016241094, 1482189677, -709670313, 1876249311, -1945628859, 1668657043, -1309277968, 1116455043, 1227880879, -1254933423, -532282495, -635630012, 312013484, -818059424, -1032145677, 1206583233, 814951044, -564501347, -962447149, 1773736345, 396506358, -1440475052, 985207365, 681203540, -1769815224, 890653120, 1036533304, 1849514884, 1275685791, -1393624622, -1685177125, -648847833, 1968574864, 653713969, -1456816562, 1036162383, 2021442550, -1197186942, -57940323, 640242692, 1887314949, -1687465495, 1087855849, -1003340951, -1435063905, -961502514, 385391079, 1385683484, 1250777318, 1560319715, 908142990, -793223710, -694174447, 1309871462, 597611532, 176176004, -432915325, 102319523, 1463214585, 175960307, -1073145319, 277145532, 1752494030, -1118353998, -549472317, 1630557612, -1789983592, -1207521932, -1460081066, -288585591, 711450600, -1559908092, -1843622241, 1559821833, -598494451, -823557788, 1866686394, 1471052358, 919779716, 1480399161, 422850212, -1393712699, -566729553, 329420902, 996786959, 556707764, 1600982725, 910394869, 1631767925, -283128717, -815568630, 1807991870, -688250256, 538167381, 314186047, 1215791938, -157886649, -1201979738, -1797965222, -422515369, 334042059, -1646369552, -1304251270, 135186954, -1767789212, 938347130, -1879597036, 1819308864, 1809833830, -509178863, 1730422898, -724469602, -495864663, 1017626634, 121545054, 1892783402, 599324247, 1553014406, -54672358, 2010372914, -940592121, 1155639799, 637880210, -1972749716, -861619957, -1362142237, -1199093804, -613366690, 1492747013, -341698072, -1320144705, 1181635328, -240087616, -1504020737, 1029316602, -1979288162, -793507780, 1965868292, -631246296, 597870595, 497698570, -1931658635, 1203203929, 1933055955, 2024703962, 1972514937, 188566211, 762182712, 714725970, -1770144476, 2010442161, -306854975, -122600928, -1945096711, 615065018, 1263000710, -112499118, 125380272, 1836744246, -372434289, 1565614564, -162174920, 1746562286, -85229450, 1151568282, -1295809538, 821744146, -817598902, -895206640, 1325006703, 867412847, -705930570, 1102579983, -937579588, 1137740512, -1891468703, 1638652193, 582956508, -916815867, -175048296, 585549414, -2074922282, -1163237069, 155495466, 1482087848, 677915712, -1789206614, 34953107, 1634010797, 982675714, 1911567117, 6683484, -1523732787, -818041249, -868210674, 2092350401, -436139837, 1511036214, -989172120, -2072489325, -385419833, -2003890300, -1026686446, -1641338272, -955257893, -2022979028, 804711345, -525170736, 1918725477, -1463675142, 373494861, -177838767, 1455547901, -1652725019, -369876921, -671816458, 1327562888, -54264684, -1773173366, -858882916, -1437152635, 1838040867, -682798847, 887504974, 1662859430, 955086118, -446083256, 1044508394, -1746083678, 1662973933, 663850149, 2053874948, 1649343561, 917229321, -278372295, -929998327, 1709443544, -1011465201, -1799391630, -818115673, 1606655374, -1904140645, -1449881917, 726580076, 202324095, 526881943, 2133844119, 362128045, 1524316327, 2083355325, 177167234, 1209286825, -198298047, -1425835687, 290010809, 2118919917, -704093607, 588466515, -876379196, -895178759, -1670792544, -1457242772, 759543921, -859583453, 191309439, 958962631, 1363436555, 1669804219, 1540084078, -1148679253, 647398348, -276220561, -993700219, -687367289, 138881679, 1929452529, -840003246, -227663051, 799895497, -2020409898, 905324525, -1410333053, -1482696262, 479116481, 408625738, -1277256722, -197675298, 1986744512, 2039161550, 483113904, 15473322, -583132939, 1364399140, 555760380, 252932468, -1849421192, 2035048528, -444049529, 2086002610, -376628868, -855767805, 1958532938, -360062874, 691509424, 487201073, -1403527034, -333981991, -911389977, -80373792, -271528440, 546867078, 557314810, -1818131389, -1767210066, 539864153, -447795732, -848708857, 1368655657, -1605167079, 74367823, 1800340715, 1475567875, -2049303263, -229173273, 1364672150, -2142303773, -1264047274, -1827690868, -140007004, 1653237776, 703387988, -2078432428, 1250605825, -13754061, -2012033814, 98512112, 886307450, -616741792, -1477298488, 1260236886, 434751377, 145002582, -402467466, 1894802080, -253356144, -1335797242, -340348024, -281938636, 800882912, -1454254255, -637135601, 1885005860, -2056968294, -1116155370, 768100434, -792453418, -1712234658, 60491627, 201084350, -1888773401, -731376029, 884782889, 1054837530, 1737457996, -40542769, -127260754, 1205861886, -1458451014, -1915116727, -1608637987, 156934533, 1742297159, 1874489291, -842684055, -621937855, -695529135, -88096836, -1416596141, 724829039, 1363187614, 793135165, 271707312, 1328929899, 1603243204, -1382007358, -1834046545, -1373696666, -1937290293, 912486373, -670116646, -304270251, -2055150064, -2141401482, 2081272476, 783573804, -940078484, -141644842, -798790397, 1067424843, -245515628, 958419077, 1154340805, 920134200, -733613374, 1601876984, -657875832, 676695695, 41658261, 154627759, 1060980061, 717481014, -569131467, 1648638343, -529798259, 1233916116, 977920698, -638677428, 798854808, -346123901, -2106433331, -273662574, -1538828422, 259468995, -2019663216, 80678340, 1650347056, 1003226034, -418727493, 661567357, 1327708025, 717833337, 1112512263, -1512713450, 257870049, 190740489, -1328950322, 194743167, -1779355398, 1094260999, 1042067955, 796731986, 1577631212, 5493252, 1848980991, -1124609755, -813220816, 1304479985, 2049343372, 1236530207, 1180049304, 50900433, -859257883, -2120914483, -1293567854, -2132836176, -1736782098, 1310467126, 991164844, 344670931};
    Map<StatType, String> stats = arrayUtils.getStats(intArray);
    stats.forEach((statType, value) -> {
        System.out.println((statType + ": " + value));
      }
    );

    // ####### problem 3 #######
    StackList<Integer> myStack = new StackList<>();
    myStack.push(1);
    myStack.push(2);
    myStack.push(3);
    myStack.push(4);       
    System.out.println("Peek: "+myStack.peek());
    System.out.println("Poping: "+myStack.pop());    
  }

}
