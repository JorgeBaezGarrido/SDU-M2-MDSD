/**
 * generated by Xtext 2.21.0
 */
package mdsd.generator;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import mdsd.rPG.Attribute;
import mdsd.rPG.Entity;
import mdsd.rPG.Move;
import mdsd.rPG.SystemRPG;
import mdsd.rPG.Type;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RPGGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final SystemRPG game = Iterators.<SystemRPG>filter(resource.getAllContents(), SystemRPG.class).next();
    final Iterator<Entity> entity = Iterators.<Entity>filter(resource.getAllContents(), Entity.class);
  }
  
  public CharSequence generateEntity(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public class Zyndaquil {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("private Type type = new Type();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("type.addType(\"Fire\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("private Set<Attribute> attributes = new HashSet<>();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("private Attribute maxHP = Attribute.createAttributeWithInt(AttributeEnum.MAX_HP, 10);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("private Attribute currentHP = Attribute.createAttributeWithInt(AttributeEnum.CURRENT_HP, 10);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("attributes.add(maxHP);  attributes.add(currentHP);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public Attribute getMaxHP(){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return maxHP;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public Attribute getCurrentHP(){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return currentHP;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void setCurrentHP(int currentHP){");
    _builder.newLine();
    _builder.append("\t\t\t\t ");
    _builder.append("this.currentHP.setValue(i);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public HashSet<Attribute> getEntityAttributes(){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return attributes;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("private Move move = new Move();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("move.addMove(\"Ember\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateType(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Type{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Set<Sting> setOfTypes = new HashSet<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String typeName;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Type(String typeName){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.typeName = typeName;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(!typeName.isEmpty())){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("addType(typeName);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addType(String type){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setOfTypes.add(type);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateMove(final Move move) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Move{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Set<String> setOfMoves = new HashSet<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String moveName;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Type type;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Set<Attribute> attributes = new HashSet<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<Effect> effects = new ArrayList<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Set<Attribute> entityAttributes = new HashSet<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class Effect{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Attribute attributePP, attributePower;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Move(String moveName, Type type, Set attributes){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.moveName = moveName;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.type = type;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.attributes = attributes;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(!moveName.isEmpty()){");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("addMove(moveName);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(type != null){");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("type.setType(\"Fire\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(!attributes.isEmpty()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("int pp = 25;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("int power = 45;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("attributePP = Attribute.createAttributeWithInt(AttributeEnum.PP.toString(), pp);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("attributePower = Attribute.createAttributeWithInt(AttributeEnum.POWER.toString(), power);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("attributes.add(attributePP); attributes.add(attributePower);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if()");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addMove(String move){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setOfMoves.add(move);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateAttribute(final Attribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Attribute{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//private Map<String, ? extends number> mapOfAttributes = new HashMap<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String pp = AttributeEnum.PP.toString());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String power = AttributeEnum.POWER.toString();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String current_hp = AttributeEnum.CURRENT_HP.toString();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String speed = AttributeEnum.SPEED.toString();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String max_hp = AttributeEnum.MAX_HP.toString();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String attributeName;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private <? extends Number> value;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Attribute(String attribute){");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("this.attributeName = attribute;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static Attribute createAttributeWithFloat(String attribute, float float){");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("Attribute a = new Attribute(attribute);");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("a.setValue(float);");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("return a;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static Attribute createAttributeWithInt(String attribute, int i){");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("Attribute a = new Attribute(attribute);");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("a.setValue(i);");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("return a; ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public <T extends Number> void setValue(T number){");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("value = number;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence attributeEnum() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("enum AttributeEnum{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("PP, POWER, CURRENT_HP, SPEED, MAX_HP;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("private int value;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("int getValue{value};");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("void setValue(int value) { this.value = value};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public Attribute(int value){");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("this.value = value;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}