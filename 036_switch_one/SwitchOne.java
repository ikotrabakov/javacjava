class SwitchOne {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Invalid number of arguments");
            return; // return will terminate execution of the main method
        }

        int numberOfDays = 0;
    
        switch(args[0]) {
            case "January":
                numberOfDays = 31;
                break; 
            case "February":
                numberOfDays = 28;
                break; 
            case "March":
                numberOfDays = 31;
                break;
            case "April":
                numberOfDays = 30;
                break;
            case "May":
                numberOfDays = 31;
                break;
            case "June":
                numberOfDays = 30;
                break;
            case "July":
                numberOfDays = 31;
                break;
            case "August":
                numberOfDays = 31;
                break;
            case "September":
                numberOfDays = 30;
                break;
            case "October":
                numberOfDays = 31;
                break;
            case "November":
                numberOfDays = 30;
                break;
            case "December":
                numberOfDays = 31;
                break;
            default: 
                System.out.println("Invalid month argument. Java is a case sensitive language. Valid months are:");
                System.out.println("January\nFebruary\nMarch\nApril\nMay\nJune");
                System.out.println("July\nAugust\nSeptember\nOctober\nNovember\nDecember");
                return; 
                //break;
        }

        if (numberOfDays == 28) {
            System.out.println("February has 28 days unless the year is evenly divisible by 4, if so, it has 29 days.");
        } else {
            System.out.println(args[0] + " has " + numberOfDays + " days.");
        }
    }
}