/* ****************************************************
   **  Welcome To Traveling Applecation.             **
   **  Create By Eng :Mohammed Hamid Saead Munaser.  ** 
   **  Department : Softwear Engineering (S.W).      ** 
   **************************************************** */
package my_project_with_foazy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static my_project_with_foazy.passenger_information.number_of_passenger;

class passenger_information {

    static int number_of_passenger = 0;
    String name_of_passenger;
    String country_of_passenger;
    String gender_of_Passengera;
    String tourist_destination_of_passenger;
    String address_of_passenger;
    String new_emile_address_of_passenger;
    String airlines_companies;
    int age_of_passenger;
    String date_of_birth;
    int ID_of_passenger;
    int phone_num_passenger;
    int type_of_the_booking_degree;
    float the_price_of_ticket;
}

public class My_Project_With_Foazy {

    static Scanner in = new Scanner(System.in);

    public static ArrayList<String> the_tourist_destinatoins = new ArrayList<>(Arrays.asList("Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia",
            "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Democratic Republic of the", "Congo, Republic of the", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor (Timor-Leste)", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland",
            "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea",
            "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein",
            "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (Burma)", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "North Macedonia (formerly Macedonia)", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines",
            "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka",
            "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"
    ));

    public static ArrayList<Integer> the_price_for_tourist_destinatoins = new ArrayList<>(Arrays.asList(
            270, 320, 180, 240, 260, 310, 230, 200, 190, 180, 200, 150, 250, 300, 180, 220, 280, 200, 210, 190,
            200, 150, 250, 300, 180, 220, 280, 200, 210, 190, 240, 310, 190, 280, 220, 300, 200, 250, 270, 310,
            240, 310, 190, 280, 220, 300, 200, 250, 270, 310, 250, 280, 220, 290, 230, 300, 320, 210, 260, 270,
            240, 310, 190, 280, 220, 300, 200, 250, 270, 310, 240, 310, 190, 280, 220, 300, 200, 250, 270, 310,
            180, 190, 320, 230, 220, 210, 240, 260, 250, 200, 240, 310, 190, 280, 220, 300, 200, 250, 270, 310,
            270, 280, 300, 310, 190, 180, 230, 320, 260, 240, 270, 280, 300, 310, 190, 180, 230, 320, 260, 240,
            270, 280, 300, 310, 190, 180, 230, 320, 260, 240, 270, 220, 250, 210, 200, 230, 300, 310, 280, 240,
            270, 220, 320, 260, 250, 210, 280, 300, 230, 200, 270, 240, 250, 310, 320, 180, 220, 190, 300, 280,
            350, 370, 320, 310, 300, 290, 280, 270, 260, 250, 240, 230, 220, 210, 200, 190, 180, 170, 160, 150,
            140, 130, 120, 110, 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 40, 30, 20
    ));

    public static ArrayList<Integer> the_Evaluate_of_airline_company = new ArrayList<>(Arrays.asList(
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5
    ));

    public static ArrayList<Integer> who_Evaluate_of_airline_company = new ArrayList<>(Arrays.asList(
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1
    ));

    public static ArrayList<Integer> the_Evaluate_of_tourist_destinatoins = new ArrayList<>(Arrays.asList(
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5
    ));
    public static ArrayList<Integer> who_Evaluate_of_tourist_destinatoins = new ArrayList<>(Arrays.asList(
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1
    ));

    static ArrayList<String> airlines = new ArrayList<>(Arrays.asList(
            "Egypt Fly (Egypt Fly)", "Emirates (UAE)", "Etihad Airways (UAE)",
            "Qatar Airways (Qatar)", "Oman Air (Oman)", "Saudia (Saudi Arabia)",
            "Jazeera Airways (Kuwait)", "Royal Jordanian (Jordan)", "Gulf Air (Bahrain)",
            "Yemenia (Yemen)", "American Airlines (USA)", "Delta Air Lines (USA)",
            "United Airlines (USA)", "Southwest Airlines (USA)", "Air France (France)",
            "British Airways (UK)", "Lufthansa (Germany)", "KLM Royal Dutch Airlines (Netherlands)", "Swiss International Air Lines (Switzerland)",
            "Singapore Airlines (Singapore)", "Cathay Pacific (Hong Kong)",
            "LATAM Airlines Group (Chile)", "Avianca (Colombia)", "Copa Airlines (Panama)",
            "Ethiopian Airlines (Ethiopia)", "South African Airways (South Africa)", "Kenya Airways (Kenya)",
            "Qantas (Australia)", "Air New Zealand (New Zealand)", "Jetstar Airways (Australia)",
            "IndiGo (India)", "SpiceJet (India)", "Pakistan International Airlines (PIA) (Pakistan)"
    ));

    static String[] months = {
        "January", "February", "March", "April",
        "May", "June", "July", "August",
        "September", "October", "November", "December"};
    static String[] email_suffixes = {"@gmail.com", "@yahoo.com", "@outlook.com", "@hotmail.com", "@icloud.com", "@microsoft.com", "@google.com", "@apple.com", "@example.com", "@harvard.edu", "@mit.edu"};

    static int total = 0;
    static passenger_information passenger[] = new passenger_information[21000000];
    static int the_price_of_ticket_for_passenger[] = new int[21000000];
    static int counter = 0;
    static int num_of_tourist_destinatoin;
    static int num_of_country;
    static int num_of_airline;
    static int num_of_airline_company;
    static String password_of_adminstrator = "mohammed@2024";

    public static boolean is_number(String number) {
        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static String make_title(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        String[] name_parts = name.split(" ");
        for (int i = 0; i < name_parts.length; i++) {
            name_parts[i] = name_parts[i].substring(0, 1).toUpperCase() + name_parts[i].substring(1);
        }
        return String.join(" ", name_parts);
    }

//                    دالة تقوم بعرض معلومات الراكب حسب رقم الراكب
    public static void print_passenger_information(int num_of_passenger) {
        System.out.println("The Passenger Number  : " + (num_of_passenger + 1));
        System.out.println("The Name Of Passenger Is : " + passenger[num_of_passenger].name_of_passenger);
        System.out.println("The gander Of Passenger Is : " + passenger[num_of_passenger].gender_of_Passengera);
        System.out.println("The Date Of Prith Is : " + passenger[num_of_passenger].date_of_birth);
        System.out.println(" The Country Of Passenger : " + passenger[num_of_passenger].country_of_passenger);
        System.out.println("The Address Of Passenger Is : " + passenger[num_of_passenger].address_of_passenger);
        System.out.println("The Emile Address Of Passenger Is : " + passenger[num_of_passenger].new_emile_address_of_passenger);
        System.out.println("The Tourist Destinatoin Of Passenger Is : " + passenger[num_of_passenger].tourist_destination_of_passenger);
        System.out.println("The Airline Of Passenger Is : " + passenger[num_of_passenger].airlines_companies);
        System.out.println("The Age Of Passenger Is : " + passenger[num_of_passenger].age_of_passenger);
        System.out.println("The ID Of Passenger Is : " + passenger[num_of_passenger].ID_of_passenger);
        System.out.println("The Age Of Passenger Is : " + passenger[num_of_passenger].age_of_passenger);
        System.out.println("The Passenger Phone Number Is : " + passenger[num_of_passenger].phone_num_passenger);
        System.out.println("The Number Of Booking Degree Is : " + passenger[num_of_passenger].type_of_the_booking_degree);
        System.out.println("The Price Of Tacket Is : " + passenger[num_of_passenger].the_price_of_ticket);
    }

//  دالة إدخل أسم المسافر
    public static void cancel() {
        int num_num_of_user = -1;
        do {
            System.out.println("Enter The Passenger Number Or Phone Number The Email Address Of Passenger");
            String string = in.next();
            if (is_number(string) && string.length() != 9) {
                if ((Integer.parseInt(string) - 1) <= (counter - 1)) {
                    num_num_of_user = (Integer.parseInt(string) - 1);
                }
            } else if (is_number(string) && string.length() == 9) {
                int copy = Integer.parseInt(string);
                for (int i = 0; i <= passenger.length; i++) {
                    if (copy == (passenger[i].phone_num_passenger)) {
                        num_num_of_user = i;
                        break;
                    }
                }
            } else if (string.endsWith("@gmail.com") || string.endsWith("@yahoo.com") || string.endsWith("@outlook.com") || string.endsWith("@hotmail.com") || string.endsWith("@icloud.com") || string.endsWith("@microsoft.com") || string.endsWith("@google.com") || string.endsWith("@apple.com") || string.endsWith("@example.com") || string.endsWith("@harvard.com") || string.endsWith("@mit.com")) {
                for (int i = 0; i < passenger.length; i++) {
                    if (string.equals(passenger[i].new_emile_address_of_passenger)) {
                        num_num_of_user = i;
                        break;
                    }
                }
            }
            int cou = 0;
            for (int i = 0; i < counter; i++) {
                if (num_num_of_user == i) {
                    continue;
                } else {
                    passenger[cou] = passenger[i];
                    total -= passenger[cou].the_price_of_ticket;
                    cou++;
                }
            }
        } while (num_num_of_user == -1 && num_num_of_user < counter);
    }

    public static void enter_name_of_passenger(int num_passenger) {
//                    يقوم المستخدم بإدخال الأسم كاملا مع مراعه أن الأسم يجب أن يكون رباعياً
        do {
            System.out.print("Enter Full Name Of The Passenger(4 Names) : \n");
            String name = in.nextLine();
//                   تقوم بتحويل الأسم الى عنوان أي تجعل الحرف الأول كبير
            String[] make_the_passenger_name_a_tital = name.split(" ");
            if (make_the_passenger_name_a_tital.length == 4) {
                passenger[num_passenger].name_of_passenger = make_title(name);
                break;
            }
        } while (true);
    }

//  دالة إدخال جنس المسافر
    public static void enter_gender_of_passenger(int num_passenger) {
//                    يقوم المستخدم بإدخال رقم نوع جنسه مع مراعه أن يختار أما واحد أو إثنينً
        do {
            System.out.println("Choose Number Of The Passenger Gander : \n"
                    + "1) Male\n"
                    + "2)Female\n"
                    + "Number Of Your Gander Is (1 Or 2) : ");
            int num_of_gander = in.nextInt();
            if (num_of_gander == 1) {
                passenger[counter].gender_of_Passengera = "Mail";
                break;
            } else if (num_of_gander == 2) {
                passenger[counter].gender_of_Passengera = "Female";
                break;
            }
            System.out.println("Choose Number Only Between 1 and 2");
        } while (true);
    }

//  دالة إدخال تاريخ ميلاد المسافر
    public static void enter_brith_date_of_passenger(int num_passenger) {
//                    يقوم المستخدم بإدخال سنة الميلاد مع مراعه أن يكون السنة المدخلة منطقية
        int The_brith_year;
        String String_The_brith_year;
        do {
            System.out.println("Enter Your brith year : ");
            The_brith_year = in.nextInt();
            if (The_brith_year > 1900 && The_brith_year < 2025) {
                String_The_brith_year = String.valueOf(The_brith_year);
                break;
            }
            System.out.println("Enter a correct age please.");
        } while (true);

//                    يقوم المستخدم بإدخال شهر الميلاد مع مراعه أن يكون الشهر المدخل منطقي
        String The_brith_month;
        do {
            System.out.println("Enter The Number Of Your Brith Month : ");
            int num_of_month = in.nextInt();
            if (num_of_month > 0 && num_of_month < 13) {
                The_brith_month = months[num_of_month - 1];
                break;
            } else {
                System.out.println("Enter A Number Between 1 To 12 : ");
            }
        } while (true);

//                    يقوم المستخدم بإدخال يوم الميلاد مع مراعه أن يكون اليوم المدخل منطقي
        String The_brith_day;
        do {
            System.out.println("Enter thr number of Your brith day : ");
            int num_of_day = in.nextInt();
            if (num_of_day > 0 && num_of_day <= 31) {
                The_brith_day = String.valueOf(num_of_day);
                break;
            } else {
                System.out.println("Enter A Number Between 1 To 31 : ");
            }
        } while (true);
        passenger[num_passenger].date_of_birth = String_The_brith_year + " / " + The_brith_month + " / " + The_brith_day;

    }

    public static String enter_country_of_passenger(int num_passenger, int number_of_country) {
        //                    يقوم المستخدم بإدخال رقم بلاده من الجدول الذي يظهر في الأعلى
        String passenger_ocuntry = the_tourist_destinatoins.get(number_of_country - 1);
        passenger[num_passenger].country_of_passenger = passenger_ocuntry;

        return passenger[num_passenger].country_of_passenger;
    }

    public static void enter_address_of_passenger(int num_passenger) {
//                    يقوم المستخدم بإدخال أسم المحافظة أو الولاية
        in.nextLine();
        System.out.print("Address Of Passenger : \n");
        System.out.print("Enter The State Of Passenger : \n");
        String State_Of_Passenger;
        String name_of_State = in.next();
        State_Of_Passenger = make_title(name_of_State);

//                    يقوم المستخدم بإدخال أسم مدينة أو قرية العيش
        System.out.print("Enter The City Or The Village Of Passenger : \n");
        String city_of_passenger;
        String name_of_city = in.next();
        city_of_passenger = make_title(name_of_city);
        passenger[num_passenger].address_of_passenger = enter_country_of_passenger(num_passenger, num_of_country) + " - " + State_Of_Passenger + " - " + city_of_passenger + " .";
    }

//  دالة إدخال عنوان إيميل المسافر
    public static void enter_email_address_of_passenger(int num_passenger) {
        //                    يقوم المستخدم بإدخال عنوان البريد الإلكتروني مع مراعه أنتهاء البريد بالجزء التالي (@gmail.com) أو ("@yahoo.com") أة ("@outlook.com") .....الخ

        boolean true_or_false = true;
        do {
            System.out.print("Enter The Emile Address Of Passenger : \n");
            String new_emile_address = in.next();
            int counted = -1;
            for (String email_suffixe : email_suffixes) {
                if (new_emile_address.endsWith(email_suffixe)) {
                    passenger[num_passenger].new_emile_address_of_passenger = new_emile_address;
                    counted++;
                    true_or_false = false;
                    break;
                }
            }
            if (counted == -1) {
                System.out.println("Enter a correct emile address please");
            }
        } while (true_or_false);

    }

//  دالة إدخال الوجهه السياحية المسافر
    public static void enter_tourist_destinatoin_of_passenger(int num_passenger) {
        //                    يقوم المستخدم بإدخال رقم الوجهة السياحية من الجدول الذي يظهر في الأعلى
        String Evaluate_of_tourist_destinatoins;
        do {
            System.out.print("Enter The Number Of Tourist Destinatoin For Passenger : \n");
            System.out.println("Number of country : The Price Of Tacket : Name of country : Volation");
            for (int i = 0; i < the_tourist_destinatoins.size(); i++) {
                System.out.println((i + 1) + " )\t\t " + the_price_for_tourist_destinatoins.get(i) + "\t\t\t " + the_tourist_destinatoins.get(i) + "\t\t" + (float) (the_Evaluate_of_tourist_destinatoins.get(i) / who_Evaluate_of_tourist_destinatoins.get(i)) + "\t*");
            }
            System.out.print("Enter The Number Of Tourist Destinatoin For Passenger(From 1 TO " + the_tourist_destinatoins.size() + " ) : \n");
            num_of_tourist_destinatoin = in.nextInt();
            if (num_of_tourist_destinatoin > 0 && num_of_tourist_destinatoin <= the_tourist_destinatoins.size()) {
                passenger[num_passenger].tourist_destination_of_passenger = the_tourist_destinatoins.get(num_of_tourist_destinatoin - 1);
                int number_of_stars = 0;
//  إمكانية تقيم الوجهة السياحية                     
                int counted = -1;
                do {
                    System.out.println("If you want to evaluate the tourist destinatoins Type\"yes\" or type any letter on the keybord to pass : ");
                    Evaluate_of_tourist_destinatoins = in.next();
                    if ("yes".equals(Evaluate_of_tourist_destinatoins.toLowerCase()) && counted == -1) {
                        System.out.println("Enter The Number Of Stars : ");
                        System.out.println("1 STARS\n"
                                + "2 STARS\n"
                                + "3 STARS\n"
                                + "4 STARS\n"
                                + "5 STARS\n");
                        System.out.println("Number Of Stars is : ");
                        number_of_stars = in.nextInt();
                        counted++;
                        if (number_of_stars > 0 && number_of_stars <= 5) {
                            the_Evaluate_of_tourist_destinatoins.set((num_of_tourist_destinatoin - 1), the_Evaluate_of_tourist_destinatoins.get(num_of_tourist_destinatoin - 1) + number_of_stars);
                            who_Evaluate_of_tourist_destinatoins.set((num_of_tourist_destinatoin - 1), who_Evaluate_of_tourist_destinatoins.get(num_of_tourist_destinatoin - 1) + 1);
                            break;
                        }
                    }
                } while ("yes".equals(Evaluate_of_tourist_destinatoins.toLowerCase()) && counted == -1);
            }
        } while (num_of_tourist_destinatoin > 0 && num_of_tourist_destinatoin <= the_tourist_destinatoins.size());

    }

//  دالة إدخال شركة النقل الجوي المسافر
    public static void enter_airline_company_of_passenger(int num_passenger) {
// إدخال رقم شركة الطيران التي يريد أن يستقيلها مع إمكانية تقيم شركة الطيران                    
        do {
            System.out.print("Enter The Number Of Airline Company For Passenger : \n");
            System.out.println("Number of Company\tThe Name of Number of Company\tVolation");
            for (int i = 0; i < airlines.size(); i++) {
                System.out.println((i + 1) + " )\t " + airlines.get(i) + (float) (the_Evaluate_of_airline_company.get(i) / who_Evaluate_of_airline_company.get(i)));
            }
            System.out.print("Enter The Number Of Airline Company For Passenger(From 1 TO " + airlines.size() + " ) : \n");
            num_of_airline_company = in.nextInt();
            if (num_of_airline_company > 0 && num_of_airline_company <= airlines.size()) {
                passenger[num_passenger].airlines_companies = airlines.get(num_of_airline_company - 1);
                int number_of_stars = 0;
                String Evaluate_of_airline_company;
                int countred = -1;
                do {
                    System.out.println("If you want to evaluate the airline company Type\"yes\" or type any letter on the keybord to pass : ");
                    Evaluate_of_airline_company = in.next();
                    if ("yes".equals(Evaluate_of_airline_company.toLowerCase()) && countred == -1) {
                        System.out.println("Enter The Number Of Stars");
                        System.out.println("1 STAR\n"
                                + "2 STARS\n"
                                + "3 STARS\n"
                                + "4 STARS\n"
                                + "5 STARS\n");
                        System.out.println("Number Of Stars is : ");
                        number_of_stars = in.nextInt();
                        if (number_of_stars > 0 && number_of_stars <= 5) {
                            the_Evaluate_of_airline_company.set((num_of_airline_company - 1), the_Evaluate_of_airline_company.get(num_of_airline_company - 1) + number_of_stars);
                            who_Evaluate_of_airline_company.set((num_of_airline_company - 1), who_Evaluate_of_airline_company.get(num_of_airline_company - 1) + 1);
                            countred++;
                            break;
                        } else {
                            countred++;
                        }
                    }
                } while ("yes".equals(Evaluate_of_airline_company.toLowerCase()) && countred == -1);
            }
        } while (num_of_airline_company > 0 && num_of_airline_company <= airlines.size());
    }

//  دالة إدخال عمر المسافر
    public static void enter_age_of_passenger(int num_passenger) {
        //                    إدخال عمر الراكب مع مراعه أن عمر الرأكب بين سنة الى مائه سنة
        do {
            System.out.print("Enter The Age Of Passenger : \n");
            int Passenger_age = in.nextInt();
            if (Passenger_age > 0 && Passenger_age < 100) {
                passenger[num_passenger].age_of_passenger = Passenger_age;
                break;
            }
            System.out.println("Enter Reasonable Age Please.");
        } while (true);
    }

//  دالة إدخال رقم البطاقة المسافر
    public static void enter_id_of_passenger(int num_passenger) {
        //                    إدخال رقم هوية الرأكب مع مراعة أن طول رقم الهوية هو خمسه أرقام
        do {
            System.out.print("Enter The Number Of ID For Passenger : \n");
            String num_of_id = in.next();
            if (is_number(num_of_id) && num_of_id.length() == 5) {
                passenger[num_passenger].ID_of_passenger = Integer.valueOf(num_of_id);
                break;
            }
            System.out.println("Enter Number That Only Consists Of 5 Num");
        } while (true);
    }

//  دالة إدخال رقم الهاتف المسافر
    public static void enter_phone_num_of_passenger(int num_passenger) {
        do {
            System.out.print("Enter The Passenger Phone Number : \n");
            String num_of_id = in.next();
            if (is_number(num_of_id) && num_of_id.length() == 9) {
                passenger[num_passenger].phone_num_passenger = Integer.parseInt(num_of_id);
                break;
            }
            System.out.println("Enter Number That Only Consists Of 9 Num");
        } while (true);
    }

//  دالة إدخال درجة حجز التذاكر المسافر
    public static void enter_booking_degree_of_passenger(int num_passenger) {

//                    إدخال رقم نوع الحجز للرأكب مع مراعة أن رقم نوع الحجز من واحد الى خمسة
        do {
            System.out.print("Enter The Number Of Booking Degree : \n"
                    + "1)Economy Class.\n"
                    + "2)Premium Economy Class.\n"
                    + "3)Business Class.\n"
                    + "4)First Class.\n"
                    + "5)Premium First Class.\n");
            passenger[num_passenger].type_of_the_booking_degree = in.nextInt();
            int type_of_the_booking_degree = passenger[num_passenger].type_of_the_booking_degree;
            num_of_tourist_destinatoin = num_of_country;
            price_of_ticket_for_passenger(num_passenger, type_of_the_booking_degree, num_of_tourist_destinatoin);
        } while (passenger[num_passenger].type_of_the_booking_degree > 5 || passenger[num_passenger].type_of_the_booking_degree < 0);

    }

//  دالة إدخال معلومات المسافر
    public static void enter_Passenger_information() {
        passenger[counter] = new passenger_information();
//                    يقوم بعرض رقم الراكب المطلوب إدخال المعلومات عنه
        System.out.println("The Number Of Passenger  : " + (number_of_passenger + 1));
        in.nextLine();
        enter_name_of_passenger(counter);
        enter_gender_of_passenger(counter);
        enter_brith_date_of_passenger(counter);

// ##########################################################################################################################                    
        do {
            System.out.print("Enter The Number Of The Passenger Country : \n");
            System.out.println("Number of country\tThe Price Of Tacket\tName of country");
            for (int i = 0; i < the_tourist_destinatoins.size(); i++) {
                System.out.println((i + 1) + " )\t\t " + the_price_for_tourist_destinatoins.get(i) + "\t\t\t " + the_tourist_destinatoins.get(i));
            }
            System.out.print("Enter The Number Of The Passenger Country : \n");
            num_of_country = in.nextInt();
            if (num_of_country > 0 && num_of_country <= the_tourist_destinatoins.size()) {
                enter_country_of_passenger(counter, num_of_country);
                break;
            }
            System.out.println("Enter Number Between 1 And " + the_price_for_tourist_destinatoins.size() + " : ");
        } while (true);
// ##########################################################################################################################                    

        enter_address_of_passenger(counter);
        enter_email_address_of_passenger(counter);
        enter_tourist_destinatoin_of_passenger(counter);
        enter_airline_company_of_passenger(counter);
        enter_age_of_passenger(counter);
        enter_id_of_passenger(counter);
        enter_phone_num_of_passenger(counter);
        enter_booking_degree_of_passenger(counter);

        print_passenger_information(counter);
        number_of_passenger++;
        counter++;
    }

    /*   دالة تطلب من المستخدم إدخال رقم الراكب أو عنوان الإيميل أو رقم الهاتف 
ليقوم بعرض معلومات المستخدم بشرط أن تكون المدخلات صحيحة بنسبة مائة بالمائة  */
    public static void show_the_passenger_information() {
        int num_num_of_user = -1;
        do {
            System.out.println("Enter The Number Or  The Name Or The Email Address  Of Passenger");
            String string = in.next();
            if (is_number(string) && string.length() != 9) {
                if ((Integer.parseInt(string) - 1) <= (counter - 1)) {
                    num_num_of_user = (Integer.parseInt(string) - 1);
                }
            } else if (is_number(string) && string.length() == 9) {
                System.out.println();
                int copy = Integer.parseInt(string);
                for (int i = 0; i <= counter; i++) {
                    if (copy == passenger[i].phone_num_passenger) {
                        num_num_of_user = i;
                        break;
                    } else {
                        num_num_of_user = -1;
                    }
                }
            } else if (string.endsWith("@gmail.com") || string.endsWith("@yahoo.com") || string.endsWith("@outlook.com") || string.endsWith("@hotmail.com") || string.endsWith("@icloud.com") || string.endsWith("@microsoft.com") || string.endsWith("@google.com") || string.endsWith("@apple.com") || string.endsWith("@example.com") || string.endsWith("@harvard.com") || string.endsWith("@mit.com")) {
                for (int i = 0; i < counter; i++) {
                    if (string.equals(passenger[i].new_emile_address_of_passenger)) {
                        num_num_of_user = i;
                        break;
                    }
                }
            }
            if (num_num_of_user != -1) {
                print_passenger_information(num_num_of_user);
                break;
            }
        } while (true);
    }

    public static void change_Passenger_information() {
        int the_number_Of_passenger;
        int num_of_passenger_information;
        int num_num_of_user = -1;
        do {
            int copy = -1;
            System.out.println("Enter The Number The Phone Number Or The Email Address  Of Passenger From 1 To " + counter + " : ");
            String string = in.next();
            if (is_number(string) && string.length() != 9) {
                if ((Integer.parseInt(string) - 1) <= (counter - 1)) {
                    num_num_of_user = (Integer.parseInt(string) - 1);
                }
            } else if (is_number(string) && string.length() == 9) {
                copy = Integer.parseInt(string);
                for (int i = 0; i <= passenger.length; i++) {
                    if (copy == (passenger[i].phone_num_passenger)) {
                        num_num_of_user = i;
                        break;
                    }
                }
            } else if (string.endsWith("@gmail.com") || string.endsWith("@yahoo.com") || string.endsWith("@outlook.com") || string.endsWith("@hotmail.com") || string.endsWith("@icloud.com") || string.endsWith("@microsoft.com") || string.endsWith("@google.com") || string.endsWith("@apple.com") || string.endsWith("@example.com") || string.endsWith("@harvard.com") || string.endsWith("@mit.com")) {
                for (int i = 0; i < passenger.length; i++) {
                    if (string.equals(passenger[i].new_emile_address_of_passenger)) {
                        num_num_of_user = i;
                        break;
                    }
                }
            } else {
                System.out.println("There Is No Pessenger In The System.");
            }
            if (num_num_of_user != -1 && num_num_of_user <= counter && num_num_of_user >= 0) {
                the_number_Of_passenger = num_num_of_user;
                do {
                    System.out.println("Enter The Number Of Information That You Want To Change It :\n"
                            + "1)The Name \n"
                            + "2)The Country \n"
                            + "3)The Address \n"
                            + "4)The Emile Address\n"
                            + "5)The Tourist Destinatoin \n"
                            + "6)The Age \n"
                            + "7)The ID Number\n"
                            + "8)The Phone Number \n"
                            + "9)The Booking Degree\n"
                            + "10)The Gander\n"
                            + "11)The Airline\n"
                            + "12)Exit"
                    );
                    System.out.println("Enter The Number Of Information That You Want To Change It :\n");
                    num_of_passenger_information = in.nextInt();

                    switch (num_of_passenger_information) {
                        case 1: {
                            enter_name_of_passenger(the_number_Of_passenger);
                            break;
                        }

                        case 2: {
                            //  ##########################################################################################################################                    
                            do {
                                System.out.print("Enter The Number Of The Passenger Country : \n");
                                System.out.println("Number of country\tThe Price Of Tacket\tName of country");
                                for (int i = 0; i < the_price_for_tourist_destinatoins.size(); i++) {
                                    System.out.println((i + 1) + " )\t\t " + the_price_for_tourist_destinatoins.get(i) + "\t\t\t " + the_tourist_destinatoins.get(i));
                                }
                                System.out.print("Enter The Number Of The Passenger Country : \n");
                                num_of_country = in.nextInt();
                                if (num_of_country > 0 && num_of_country <= the_tourist_destinatoins.size()) {
                                    enter_country_of_passenger(the_number_Of_passenger, num_of_country);
                                    break;
                                }
                                System.out.println("Enter Number Between 1 And " + the_price_for_tourist_destinatoins.size() + " : ");
                            } while (true);
                            // ##########################################################################################################################                    
                            break;
                        }

                        case 3: {
                            enter_address_of_passenger(the_number_Of_passenger);
                            break;
                        }

                        case 4: {
                            enter_email_address_of_passenger(the_number_Of_passenger);
                            break;
                        }

                        case 5: {
                            enter_tourist_destinatoin_of_passenger(the_number_Of_passenger);
                            break;
                        }

                        case 6: {
                            enter_age_of_passenger(the_number_Of_passenger);
                            break;
                        }

                        case 7: {
                            enter_id_of_passenger(the_number_Of_passenger);
                            break;
                        }

                        case 8: {
                            enter_phone_num_of_passenger(the_number_Of_passenger);
                            break;
                        }

                        case 9: {
                            enter_booking_degree_of_passenger(the_number_Of_passenger);
                            break;
                        }

                        case 10: {
                            enter_gender_of_passenger(the_number_Of_passenger);
                            break;
                        }
                        case 11: {
                            enter_airline_company_of_passenger(the_number_Of_passenger);
                            break;
                        }
                        default:
                            System.out.println("There Is No Operation.Chose Another Number : ");
                    }
                } while (num_of_passenger_information != 12);
                break;
            }
        } while (true);
    }

    public static void show_dourist_destinatoin_or_airline_coumpany_information() {
        int num_of_opration;
        do {
            System.out.println("Enter Thr Num Of Showing That You Want To See : "
                    + "1) Tourist Destinatoin."
                    + "2) Airline."
                    + "3) Exit.");
            num_of_opration = in.nextInt();
            switch (num_of_opration) {
                case 1: {

                    System.out.println("Number of country  :  Name of country");
                    int cou2 = 0;
                    for (String country : the_tourist_destinatoins) {
                        System.out.println((cou2 + 1) + ")\t" + country);
                        cou2++;
                    }
                    System.out.print("Enter The Number Of Tourist Destinatoin For Passenger : \n");
                    num_of_tourist_destinatoin = in.nextInt();
                    for (int i = 0; i < counter; i++) {
                        if (the_tourist_destinatoins.get(num_of_tourist_destinatoin - 1).equals(passenger[i].tourist_destination_of_passenger)) {
                            System.out.println(passenger[i].name_of_passenger + "\t" + passenger[i].type_of_the_booking_degree);
                        }
                    }
                    System.out.println("The Valuation Of " + the_tourist_destinatoins.get(num_of_tourist_destinatoin - 1) + (float) (the_Evaluate_of_tourist_destinatoins.get(num_of_tourist_destinatoin - 1) / who_Evaluate_of_tourist_destinatoins.get(num_of_tourist_destinatoin - 1)));
                    break;
                }
                case 2: {
                    System.out.println("Number Of Compnay  :  Name of Airline Compnay");
                    int cou2 = 0;
                    for (String airline : airlines) {
                        System.out.println((cou2 + 1) + ")\t" + airline);
                        cou2++;
                    }
                    System.out.print("Enter The Number Of Airline For Passenger : \n");
                    num_of_airline = in.nextInt();
                    for (int i = 0; i < counter; i++) {
                        if (the_tourist_destinatoins.get(num_of_airline - 1).equals(passenger[i].tourist_destination_of_passenger)) {
                            System.out.println(passenger[i].name_of_passenger + "\t" + passenger[i].type_of_the_booking_degree);
                        }
                    }
                    System.out.println("The Valuation Of " + airlines.get(num_of_airline - 1) + (float) (the_Evaluate_of_airline_company.get(num_of_airline - 1) / who_Evaluate_of_airline_company.get(num_of_airline - 1)));
                    break;
                }
                default:
                    System.out.println("Threr Is No Opatoin .");
            }

        } while (num_of_opration != 3);
    }

    public static void sitting() {
        int Number_Of_Opration;
        do {
            System.out.println("Enter The Number Of Opration : ");
            System.out.println("1) Add A New Tourist Destinatoins");
            System.out.println("2) Dalete A Tourist Destinatoins");
            System.out.println("3) Add A New Airline");
            System.out.println("4) Dalete Airline");
            System.out.println("5) Change The Pasword Of Sitting");
            System.out.println("6) Exit");
            System.out.println("Enter The Number Of Opration : ");
            Number_Of_Opration = in.nextInt();
            switch (Number_Of_Opration) {
                case 1: {
                    System.out.println("Enter The Name Of Country That You Want To Add : ");
                    String Add = in.next();
                    the_tourist_destinatoins.add(Add);
                    System.out.println("Enter The Price Of Ticket That You Want To Add : ");
                    int the_price_of_new_ticket = in.nextInt();
                    the_price_for_tourist_destinatoins.add(the_price_of_new_ticket);
                    the_Evaluate_of_airline_company.add(5);
                    who_Evaluate_of_airline_company.add(1);
                    break;
                }

                case 2: {
                    do {
                        System.out.println("No : Countries");
                        for (int i = 0; i < the_tourist_destinatoins.size(); i++) {
                            System.out.println((1 + i) + " : " + the_tourist_destinatoins.get(i));
                        }
                        System.out.println("Enter Number Of The Tourist Destinatoins That You Want To Dalete It : ");
                        int Daleted_tourist_destinatoins = in.nextInt();
                        if (Daleted_tourist_destinatoins > 0 && Daleted_tourist_destinatoins <= the_tourist_destinatoins.size()) {
                            the_tourist_destinatoins.remove(the_tourist_destinatoins.get(Daleted_tourist_destinatoins - 1));
                            the_Evaluate_of_airline_company.remove(the_tourist_destinatoins.get(Daleted_tourist_destinatoins - 1));
                            who_Evaluate_of_airline_company.remove(the_tourist_destinatoins.get(Daleted_tourist_destinatoins - 1));
                            break;
                        }
                    } while (true);
                    break;
                }
                case 3: {
                    System.out.println("Enter The Name Of Airline That You Want To Add : ");
                    String Add = in.next();
                    System.out.println("Enter The Country Of Airline That You Want To Add : ");
                    String Add_cou = in.next();
                    airlines.add((Add + " (" + Add_cou + " )"));
                    who_Evaluate_of_tourist_destinatoins.add(5);
                    the_Evaluate_of_tourist_destinatoins.add(1);
                    break;
                }
                case 4: {
                    System.out.println("No : Airlines");
                    for (int i = 0; i < airlines.size(); i++) {
                        System.out.println((1 + i) + " : " + airlines.get(i));
                    }
                    System.out.println("Enter Number Of The Airline That You Want To Dalete It : ");
                    int num_airline = in.nextInt();
                    airlines.remove(airlines.get(num_airline));
                    who_Evaluate_of_tourist_destinatoins.remove(airlines.get(num_airline));
                    the_Evaluate_of_tourist_destinatoins.remove(airlines.get(num_airline));
                    break;
                }
                case 5: {
                    System.out.println("Enter The New Password");
                    String new_password = in.next();
                    password_of_adminstrator = new_password;
                    break;
                }
                default:
                    System.out.println("There Is No Operation.Chose Another Number : ");
            }
        } while (Number_Of_Opration != 6);
    }

    public static void statistics() {

        int num_of_operation;
        do {
            System.out.println("Eeter Nunber Of "
                    + "1)Show The Total Of Price.\n"
                    + "2)Show The Tourist Destinatoin statistics.\n"
                    + "3)Show The Airline Company statistics.\n"
                    + "4)Exit.");
            num_of_operation = in.nextInt();
            switch (num_of_operation) {
                case 1: {
                    System.out.println("The Total Of Passenger Ticket is " + total + " $");
                    System.out.println("The Total Of Passenger" + counter + " .");
                    break;
                }
                case 2: {
                    System.out.print("Enter The Number Of Tourist Destinatoin For Passengers : \n");
                    System.out.println("Number of country\tThe Price Of Tacket\tName of country");
                    for (int k = 0; k < the_tourist_destinatoins.size(); k++) {
                        System.out.println((k + 1) + ") \t " + the_tourist_destinatoins.get(k));
                    }
                    int counter_of_tourist_destinatoin = 0;
                    System.out.print("Enter The Number Of Tourist Destinatoin For Passenger : \n");
                    int Number_Of_Tourist_Destinatoin = in.nextInt();
                    if (Number_Of_Tourist_Destinatoin > 0 && Number_Of_Tourist_Destinatoin <= the_tourist_destinatoins.size()) {
                        for (int i = 0; i < counter; i++) {
                            if (the_tourist_destinatoins.get(Number_Of_Tourist_Destinatoin - 1) == passenger[i].tourist_destination_of_passenger) {
                                print_passenger_information(i);
                            }
                            counter_of_tourist_destinatoin++;
                            break;
                        }
                    } else {
                        System.out.println("Enter Number Between 1 And" + the_tourist_destinatoins.size() + " Please.");
                    }
                    System.out.println("The Total Of Passengers They Visit " + the_tourist_destinatoins.get(Number_Of_Tourist_Destinatoin - 1) + " Are " + counter_of_tourist_destinatoin);
                    System.out.println("The Evaluate Of " + the_tourist_destinatoins.get(Number_Of_Tourist_Destinatoin - 1) + " = " + (float) (the_Evaluate_of_tourist_destinatoins.get(Number_Of_Tourist_Destinatoin - 1) / who_Evaluate_of_tourist_destinatoins.get(Number_Of_Tourist_Destinatoin - 1)) + " *");
                    break;
                }
                case 3: {
                    System.out.print("Enter The Number Of Airline For Passenger : \n");
                    System.out.println("Number of company\tName of airlines company");
                    for (int k = 0; k < airlines.size(); k++) {
                        System.out.println((k + 1) + ")\t\t " + airlines.get(k));
                    }
                    int counter_of_airline = 0;
                    System.out.print("Enter The Number Of Number Of Tourist Destinatoin For Passenger : \n");
                    int number_of_airlines_company = in.nextInt();
                    if (number_of_airlines_company > 0 && number_of_airlines_company <= airlines.size()) {
                        for (int i = 0; i < counter; i++) {
                            if (airlines.get(number_of_airlines_company - 1) == passenger[i].airlines_companies) {
                                print_passenger_information(i);
                            }
                            counter_of_airline++;
                            break;
                        }
                    } else {
                        System.out.println("Enter Number Between 1 And" + airlines.size() + " Please.");
                    }
                    System.out.println("The Total Of Passengers The Visit " + airlines.get(number_of_airlines_company - 1) + " Are " + counter_of_airline);
                    System.out.println("The Evaluate Of " + airlines.get(number_of_airlines_company - 1) + " = " + (float) (the_Evaluate_of_airline_company.get(number_of_airlines_company - 1) / who_Evaluate_of_airline_company.get(number_of_airlines_company - 1)) + " *");
                    break;
                }
                default: {
                    System.out.println("Threr is No Opation.");
                }
            }
        } while (num_of_operation != 4);

    }

    public static int price_of_ticket_for_passenger(int num_of_passenger, int num_of_booking_degre, int num_of_country) {
        switch (num_of_booking_degre) {
            case 1: {
                the_price_of_ticket_for_passenger[num_of_passenger] = the_price_for_tourist_destinatoins.get(num_of_country - 1);
                passenger[num_of_passenger].the_price_of_ticket = the_price_of_ticket_for_passenger[num_of_passenger];
                break;
            }
            case 2: {
                the_price_of_ticket_for_passenger[num_of_passenger] = (int) (float) (the_price_for_tourist_destinatoins.get(num_of_country - 1) + the_price_for_tourist_destinatoins.get(num_of_country - 1) * 0.20);
                passenger[num_of_passenger].the_price_of_ticket = the_price_of_ticket_for_passenger[num_of_passenger];
                break;
            }
            case 3: {
                the_price_of_ticket_for_passenger[num_of_passenger] = (int) (float) (the_price_for_tourist_destinatoins.get(num_of_country - 1) + the_price_for_tourist_destinatoins.get(num_of_country - 1) * 0.40);
                passenger[num_of_passenger].the_price_of_ticket = the_price_of_ticket_for_passenger[num_of_passenger];
                break;
            }
            case 4: {
                the_price_of_ticket_for_passenger[num_of_passenger] = (int) (float) (the_price_for_tourist_destinatoins.get(num_of_country - 1) + the_price_for_tourist_destinatoins.get(num_of_country - 1) * 0.60);
                passenger[num_of_passenger].the_price_of_ticket = the_price_of_ticket_for_passenger[num_of_passenger];
                break;
            }
            case 5: {
                the_price_of_ticket_for_passenger[num_of_passenger] = (int) (float) (the_price_for_tourist_destinatoins.get(num_of_country - 1) + the_price_for_tourist_destinatoins.get(num_of_country - 1) * 0.80);
                passenger[num_of_passenger].the_price_of_ticket = the_price_of_ticket_for_passenger[num_of_passenger];
                break;
            }
        }
        total += passenger[num_of_passenger].the_price_of_ticket;
        return the_price_of_ticket_for_passenger[num_of_passenger];
    }

    public static void main(String[] args) {
        for (int i = 0; i < the_price_of_ticket_for_passenger.length; i++) {
            the_price_of_ticket_for_passenger[i] = 0;
        }
        System.out.println("****************************************************");
        System.out.println("**  Welcome To Traveling Applecation.             **\n"
                + "**  Create By Eng :Mohammed Hamid Saead Munaser.  **\n"
                + "**  Department : Softwear Engineering (S.W).      **\n"
                + "****************************************************");
        System.out.println("\n\n\n");
        int num_of_oparetion;
        do {
            System.out.println("Enter The Number Of Oparetoin : ");
            System.out.print("1)Enter The Passenger Informatoin \n"
                    + "2)Show The Passenger Informatoin \n"
                    + "3)Change The Passenger Informatoin \n"
                    + "4)Show Dourist Destinatoin Or Airline Coumpany Information\n"
                    + "5)Sitting\n"
                    + "6)Statistics\n"
                    + "7)Cancel\n"
                    + "Enter Number Of Oparetoin : ");
            num_of_oparetion = in.nextInt();
            System.out.println("");
            switch (num_of_oparetion) {
                case 1: {
                    enter_Passenger_information();
                    break;
                }
                case 2: {
                    show_the_passenger_information();
                    break;
                }
                case 3: {
                    change_Passenger_information();
                    break;
                }
                case 4: {
                    show_dourist_destinatoin_or_airline_coumpany_information();
                    break;
                }
                case 5: {
                    int counted = 3;
                    do {
                        System.out.println("Enter The Password : ");
                        System.out.println("You Have " + (counted + 1) + " Tries");
                        String The_Password = in.next();
                        if (The_Password.equals(password_of_adminstrator) && counted > 0) {
                            sitting();
                            break;
                        } else if (counted == 0) {
                            break;
                        } else {
                            --counted;
                        }
                    } while (true);
                    break;
                }
                case 6: {
                    statistics();
                    break;
                }
                case 7: {
                    cancel();
                    break;
                }
                default:
                    System.out.println("There Is No Opration!");
            }
        } while (num_of_oparetion != 8);
    }
}
