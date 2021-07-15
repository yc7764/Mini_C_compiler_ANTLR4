package ANTLR4_compiler;
import java.util.*;

enum TypeSpecifier{
	NON_SPECIFIER,  VOID_TYPE,  INT_TYPE
}

enum TypeQualifier{
	NON_QUALIFIER,	FUNC_TYPE, PARAM_TYPE,  CONST_TYPE,  VAR_TYPE
}

public class SymbolTable {
	private Stack<Table> stack;
	
	public SymbolTable() {
		stack = new Stack<Table>();
	}
	
	public SymbolEntry lookup(String name) {
		Table table;
		SymbolEntry result = null;
		
		for(int level=stack.size()-1;level>=0;level--) {
			table = stack.elementAt(level);
			result = table.lookup(name);
			if(result != null) {
				break;
			}
		}
		return result;
	}
	
	public void insert(String name, TypeSpecifier specifier, TypeQualifier qualifier, int base,
			int offset, int width, int initialValue) {
		if(stack.isEmpty())
			System.out.println("error : stack is empty");
		else {
			Table TopTable = stack.peek();
			if(TopTable.lookup(name)==null) {
				SymbolEntry symbolentry = new SymbolEntry(name, specifier, qualifier,
						base, offset, width, initialValue);
				TopTable.insert(name, symbolentry);
			}
			else {
				System.out.println("multiply defined identifier : "+name+"\n");
			}
		}
	}
	
	public void set() {
		Table hashmap = new Table();
		stack.push(hashmap);
	}
	
	public void reset() {
		if(stack.isEmpty())
			System.out.println("error : symboltable is empty");
		else
			stack.pop();
	}
}
class Table{
	private HashMap<String, SymbolEntry> map;

	public Table() {
		map = new HashMap<String, SymbolEntry>();
	}
	public SymbolEntry lookup(String name) {
		return map.get(name);
	}
	public void insert(String name, SymbolEntry symbolentry) {
		map.put(name, symbolentry);
	}
}
class SymbolEntry {
	private String symbolName;
	private TypeSpecifier typeSpecifier;
	private TypeQualifier typeQualifier;
	private int base;
	private int offset;
	public String getSymbolName() {
		return symbolName;
	}
	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}
	public TypeSpecifier getTypeSpecifier() {
		return typeSpecifier;
	}
	public void setTypeSpecifier(TypeSpecifier typeSpecifier) {
		this.typeSpecifier = typeSpecifier;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getInitialValue() {
		return initialValue;
	}
	public void setInitialValue(int initialValue) {
		this.initialValue = initialValue;
	}
	private int width;
	private int initialValue;
	
	public TypeQualifier getTypeQualifier() {
		return typeQualifier;
	}
	public void setTypeQualifier(TypeQualifier typeQualifier) {
		this.typeQualifier = typeQualifier;
	}
	public SymbolEntry(String name, TypeSpecifier specifier, TypeQualifier qualifier, int base,
			int offset, int width, int initialValue) {
		this.symbolName = name;
		this.typeSpecifier = specifier;
		this.typeQualifier = qualifier;
		this.base = base;
		this.offset = offset;
		this.width = width;
		this.initialValue = initialValue;
	}
	@Override
	public String toString() {
		String entry = "Name: "+symbolName+", Specifier: "+typeSpecifier.toString()+", Qualifier: "+
					typeQualifier.toString()+",\n\t base: "+base+", offset: "+offset+", width: "+width+
					", initialValue: "+initialValue;
		return entry;
	}
}