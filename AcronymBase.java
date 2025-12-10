public abstract class AcronymBase {

    // ROULETTE CATEGORIES
    protected String[] categories = {
            "Technology",
            "Social Media",
            "Medical",
            "Education",
            "Business"
    };

    // ============================
    // TECHNOLOGY (40)
    // ============================
    protected String[] techAcronyms = {
            "CPU","RAM","ROM","SSD","HDD","USB","GPU","API","HTML","CSS",
            "HTTP","HTTPS","DNS","IP","TCP","UDP","LAN","WAN","OS","DBMS",
            "SQL","XML","JSON","AI","ML","IoT","VPN","IDE","OOP","JVM",
            "JDK","JRE","SSH","PCI","CDN","PDF","PNG","JPEG","BIOS"
    };

    protected String[] techFull = {
            "Central Processing Unit","Random Access Memory","Read Only Memory",
            "Solid State Drive","Hard Disk Drive","Universal Serial Bus",
            "Graphics Processing Unit","Application Programming Interface",
            "HyperText Markup Language","Cascading Style Sheets",
            "HyperText Transfer Protocol","HyperText Transfer Protocol Secure",
            "Domain Name System","Internet Protocol","Transmission Control Protocol",
            "User Datagram Protocol","Local Area Network","Wide Area Network",
            "Operating System","Database Management System",
            "Structured Query Language","Extensible Markup Language",
            "JavaScript Object Notation","Artificial Intelligence",
            "Machine Learning","Internet of Things","Virtual Private Network",
            "Integrated Development Environment","Object-Oriented Programming",
            "Java Virtual Machine","Java Development Kit",
            "Java Runtime Environment","Secure Shell","Peripheral Component Interconnect",
            "Content Delivery Network","Portable Document Format",
            "Portable Network Graphics","Joint Photographic Experts Group",
            "Basic Input Output System"
    };

    // ============================
    // SOCIAL MEDIA (40)
    // ============================
    protected String[] smAcronyms = {
            "LOL","BRB","TTYL","OMG","TBH","IDK","FYI","BTW","DM","PM",
            "IRL","NVM","ILY","ROFL","SMH","BFF","AFK","GTG","TT","IG",
            "FB","YT","SC","WCW","MCM","ASAP","LMAO","ICYMI","FOMO","TMI",
            "ETA","OOTD","NSFW","ICYDK","JK","IMO","IDC","GG","RN"
    };

    protected String[] smFull = {
            "Laugh Out Loud","Be Right Back","Talk To You Later","Oh My God",
            "To Be Honest","I Don't Know","For Your Information","By The Way",
            "Direct Message","Private Message","In Real Life","Never Mind",
            "I Love You","Rolling On Floor Laughing","Shaking My Head",
            "Best Friends Forever","Away From Keyboard","Got To Go",
            "Trending Topic","Instagram","Facebook","YouTube","Snapchat",
            "Woman Crush Wednesday","Man Crush Monday","As Soon As Possible",
            "Laughing My Ass Off","In Case You Missed It","Fear Of Missing Out",
            "Too Much Information","Estimated Time of Arrival",
            "Outfit Of The Day","Not Safe For Work","In Case You Didn't Know",
            "Just Kidding","In My Opinion","I Don't Care","Good Game","Right Now"
    };

    // ============================
    // MEDICAL (40)
    // ============================
    protected String[] medAcronyms = {
            "BP","HR","ICU","OPD","ECG","EEG","MRI","CT","COVID","BMI",
            "CBC","WBC","RBC","ICD","IV","CPR","ENT","DNA","RNA","BMR",
            "PCOS","PMDD","HIV","AIDS","TB","COPD","NSAID","ICF","CRT","ICU2",
            "ICD10","BP2","HDL","LDL","TSH","RMP","NICU","IC","HPV"
    };

    protected String[] medFull = {
            "Blood Pressure","Heart Rate","Intensive Care Unit","Outpatient Department",
            "Electrocardiogram","Electroencephalogram","Magnetic Resonance Imaging",
            "Computed Tomography","Coronavirus Disease","Body Mass Index",
            "Complete Blood Count","White Blood Cells","Red Blood Cells",
            "International Classification of Diseases","Intravenous",
            "Cardiopulmonary Resuscitation","Ear Nose Throat",
            "Deoxyribonucleic Acid","Ribonucleic Acid","Basal Metabolic Rate",
            "Polycystic Ovary Syndrome","Premenstrual Dysphoric Disorder",
            "Human Immunodeficiency Virus","Acquired Immunodeficiency Syndrome",
            "Tuberculosis","Chronic Obstructive Pulmonary Disease",
            "Non-Steroidal Anti-Inflammatory Drug","International Classification of Functioning",
            "Capillary Refill Time","Intensive Care Unit (Alternate)",
            "International Classification of Diseases 10",
            "Blood Pressure (Alternate)","High Density Lipoprotein",
            "Low Density Lipoprotein","Thyroid Stimulating Hormone",
            "Registered Medical Practitioner","Neonatal ICU",
            "Interstitial Cystitis","Human Papillomavirus"
    };

    // ============================
    // EDUCATION (40)
    // ============================
    protected String[] eduAcronyms = {
            "GPA","CGPA","SAT","ACT","MOOC","NPTEL","CBSE","NCERT","UGC","AICTE",
            "BE","BTech","BA","BSc","BCom","MBA","MCA","PhD","UG","PG",
            "PTM","NSS","NCC","IT","CS","ECE","EEE","CE","ME","AI",
            "ML","DS","ICT","IS","CAE","NET","SET","JRF","CAT"
    };

    protected String[] eduFull = {
            "Grade Point Average","Cumulative Grade Point Average",
            "Scholastic Assessment Test","American College Testing",
            "Massive Open Online Course","National Programme on Technology Enhanced Learning",
            "Central Board of Secondary Education","National Council of Educational Research and Training",
            "University Grants Commission","All India Council for Technical Education",
            "Bachelor of Engineering","Bachelor of Technology","Bachelor of Arts",
            "Bachelor of Science","Bachelor of Commerce","Master of Business Administration",
            "Master of Computer Applications","Doctor of Philosophy",
            "Undergraduate","Postgraduate","Parent Teacher Meeting",
            "National Service Scheme","National Cadet Corps","Information Technology",
            "Computer Science","Electronics and Communication Engineering",
            "Electrical and Electronics Engineering","Civil Engineering","Mechanical Engineering",
            "Artificial Intelligence","Machine Learning","Data Science",
            "Information and Communication Technology","Information Systems",
            "Computer-Aided Engineering","National Eligibility Test",
            "State Eligibility Test","Junior Research Fellowship",
            "Common Admission Test"
    };

    // ============================
    // BUSINESS (40)
    // ============================
    protected String[] busAcronyms = {
            "CEO","CFO","CTO","COO","ROI","HR","PR","R&D","KPI","CRM",
            "ERP","IPO","GST","VAT","TDS","P&L","B2B","B2C","SME","MOU",
            "NDA","SOP","RFP","RFQ","AMC","FMCG","GDP","SLA","QA","QC",
            "ETD","ETA","MSME","NBFC","PAN","ITR","KYC","TAT","PO"
    };

    protected String[] busFull = {
            "Chief Executive Officer","Chief Financial Officer","Chief Technology Officer",
            "Chief Operating Officer","Return On Investment","Human Resources",
            "Public Relations","Research and Development","Key Performance Indicator",
            "Customer Relationship Management","Enterprise Resource Planning",
            "Initial Public Offering","Goods and Services Tax","Value Added Tax",
            "Tax Deducted at Source","Profit and Loss","Business to Business",
            "Business to Consumer","Small and Medium Enterprises",
            "Memorandum of Understanding","Non Disclosure Agreement",
            "Standard Operating Procedure","Request For Proposal",
            "Request For Quotation","Annual Maintenance Contract",
            "Fast Moving Consumer Goods","Gross Domestic Product",
            "Service Level Agreement","Quality Assurance","Quality Control",
            "Estimated Time of Departure","Estimated Time of Arrival",
            "Micro Small Medium Enterprise","Non Banking Financial Company",
            "Permanent Account Number","Income Tax Return","Know Your Customer",
            "Turnaround Time","Purchase Order"
    };

    public AcronymBase() {
        //System.out.println("AcronymBase Constructor");
    }

    public abstract void displayWelcome();
}