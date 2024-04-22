package solid;

public class OCP {
}

// this class is open for modification incase a new category is added
class BadEarningsCalculator {
    public double calculateEarnings(String category) {
        if(category.equals("education")) {
            return calculateEducationEarnings();
        } else if(category.equals("entertainment")) {
            return calculateEntertainmentEarnings();
        }
        return 0;
    }

    public double calculateEducationEarnings() {
        // Calculate earnings for education category
        return 0;
    }

    public double calculateEntertainmentEarnings() {
        // Calculate earnings for entertainment category
        return 1;
    }
}

interface EarningsCalculator {
    double calculateEarnings();
}

// this class is closed for modification, but open for extension
class EducationEarningsCalculator implements EarningsCalculator {
    public double calculateEarnings() {
        // Calculate earnings for education category
        return 0;
    }
}

// this class is closed for modification, but open for extension
class EntertainmentEarningsCalculator implements EarningsCalculator {
    public double calculateEarnings() {
        // Calculate earnings for entertainment category
        return 1;
    }
}
