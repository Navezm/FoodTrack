package be.TechnofuturTIC.foodtrack.models.macros;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DataTableModel<TRow, TCol, TValue> {

    private Map<TRow, Map<TCol, TValue>> table = new HashMap<>();

    public Set<TCol> columnKeySet() {
        Set<TCol> columnKeySet = new HashSet<>();

        table.forEach((key, value) -> columnKeySet.addAll(value.keySet()));

        return columnKeySet;
    }
    public Set<TRow> rowKeySet() {
        return new HashSet<>(table.keySet());
    }
    public TValue get(TRow row, TCol col) {
        return getLine(row).get(col);
    }
    public Map<TCol, TValue> getLine(TRow row) {
        return table.get(row);
    }

    public DataTableModel<TRow, TCol, TValue> put(TRow row, TCol col, TValue value) {
        if (!table.containsKey(row)) {
            table.put(row, new HashMap<>());
        }

        if (!table.get(row).containsKey(col)) {
            table.get(row).put(col, value);
        }

        return this;
    }
}
