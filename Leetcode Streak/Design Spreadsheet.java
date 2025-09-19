import java.util.*;

class Spreadsheet {
    private final Map<String, Integer> cells;

    public Spreadsheet(int rows) {
        // rows not needed for this simple implementation, but kept for signature compatibility
        this.cells = new HashMap<>();
    }

    public void setCell(String cell, int value) {
        cells.put(cell, value);
    }

    public void resetCell(String cell) {
        cells.remove(cell);
    }

    public int getValue(String formula) {
        if (formula == null || formula.isEmpty()) return 0;

        // allow formulas that start with '=' or raw expressions/numbers/cell refs
        String expr = (formula.charAt(0) == '=') ? formula.substring(1) : formula;
        String[] parts = expr.split("\\+");
        int sum = 0;

        for (String part : parts) {
            part = part.trim();
            if (part.isEmpty()) continue;

            if (isCellRef(part)) {
                sum += cells.getOrDefault(part, 0);
            } else {
                try {
                    sum += Integer.parseInt(part);
                } catch (NumberFormatException e) {
                    // invalid token -> treat as 0
                }
            }
        }
        return sum;
    }

    // quick check for cell-like token: uppercase letters followed by digits (A1, AA12, ...)
    private boolean isCellRef(String s) {
        int n = s.length();
        if (n == 0) return false;
        int i = 0;
        while (i < n && Character.isUpperCase(s.charAt(i))) i++;
        if (i == 0) return false;        // no letters
        if (i == n) return false;        // no digits
        while (i < n) {
            if (!Character.isDigit(s.charAt(i))) return false;
            i++;
        }
        return true;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */
