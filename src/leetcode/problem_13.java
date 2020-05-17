package leetcode;

public class problem_13 {
    public int romanToInt(String s) {
        int retVal = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    retVal += 1000;
                    break;
                case 'D':
                    retVal += 500;
                    break;
                case 'C':
                    try {
                        switch (s.charAt(i + 1)) {
                            case 'D':
                                retVal += 400;
                                i++;  // skip checking the next char
                                break;
                            case 'M':
                                retVal += 900;
                                i++;  // skip checking the next char
                                break;
                            default:
                                retVal += 100;
                                break;
                        }
                    } catch (StringIndexOutOfBoundsException e) {
                        retVal += 100;
                        continue;
                    }
                    break;
                case 'L':
                    retVal += 50;
                    break;
                case 'X':
                    try {
                        switch (s.charAt(i + 1)) {
                            case 'L':
                                retVal += 40;
                                i++;  // skip checking the next char
                                break;
                            case 'C':
                                retVal += 90;
                                i++;  // skip checking the next char
                                break;
                            default:
                                retVal += 10;
                                break;
                        }
                    } catch (StringIndexOutOfBoundsException e) {
                        retVal += 10;
                        continue;
                    }
                    break;
                case 'V':
                    retVal += 5;
                    break;
                case 'I':
                    try {
                        switch (s.charAt(i + 1)) {
                            case 'V':
                                retVal += 4;
                                i++;  // skip checking the next char
                                break;
                            case 'X':
                                retVal += 9;
                                i++;  // skip checking the next char
                                break;
                            default:
                                retVal += 1;
                                break;
                        }
                    } catch (StringIndexOutOfBoundsException e) {
                        retVal += 1;
                        continue;
                    }
                    break;
                default:
                    return -1;
            }
        }

        return retVal;
    }
}
