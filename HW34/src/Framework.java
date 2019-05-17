import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Framework {
    private static Class<?>[] parameterTypes;

    public static <T> List<T> getManyWithCons(Class<T> c, int count, Object... params) {
        List<T> l = new ArrayList<>();
        Constructor constructor = findConstructor(c, getParameters(params));
        if (constructor == null) throw new IllegalArgumentException("Constructor not found");
        for (int j = 0; j < count; j++) {
            try {
                l.add(c.getConstructor(parameterTypes).newInstance(params));
            } catch (InstantiationException | IllegalAccessException |
                    InvocationTargetException | NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return l;
    }

    private static <T> Constructor findConstructor(Class<T> c, Class<?>[] parameters) {
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            Class<?>[] constrParameters = constructor.getParameterTypes();
            if (ConstructorEquals(parameters, constrParameters)) {
                return constructor;
            }
        }
        return null;
    }

    private static boolean ConstructorEquals(Class<?>[] parameters, Class<?>[] constrParameters) {
        if (parameters.length != constrParameters.length) return false;
        parameterTypes = new Class<?>[constrParameters.length];
        for (int i = 0; i < parameters.length; i++) {
            if (!constrParameters[i].isPrimitive() &&
                    !constrParameters[i].getTypeName().equals(parameters[i].getTypeName())) {
                return false;
            } else {
                parameterTypes[i] = parameters[i];
            }

            if (constrParameters[i].isPrimitive()) {
                switch (constrParameters[i].getTypeName()) {
                    case "int":
                        if (parameters[i].getTypeName().equals(Integer.class.getTypeName())) {
                            parameterTypes[i] = int.class;
                        } else return false;
                        break;
                    case "byte":
                        if (parameters[i].getTypeName().equals(Byte.class.getTypeName())) {
                            parameterTypes[i] = byte.class;
                        } else return false;
                        break;
                    case "float":
                        if (parameters[i].getTypeName().equals(Float.class.getTypeName())) {
                            parameterTypes[i] = float.class;
                        } else return false;
                        break;
                    case "boolean":
                        if (parameters[i].getTypeName().equals(Boolean.class.getTypeName())) {
                            parameterTypes[i] = boolean.class;
                        } else return false;
                        break;
                    case "short":
                        if (parameters[i].getTypeName().equals(Short.class.getTypeName())) {
                            parameterTypes[i] = boolean.class;
                        } else return false;
                        break;
                    case "long":
                        if (parameters[i].getTypeName().equals(Long.class.getTypeName())) {
                            parameterTypes[i] = long.class;
                        } else return false;
                        break;
                    case "double":
                        if (parameters[i].getTypeName().equals(Double.class.getTypeName())) {
                            parameterTypes[i] = double.class;
                        } else return false;
                        break;
                    case "char":
                        if (parameters[i].getTypeName().equals(char.class.getTypeName())) {
                            parameterTypes[i] = char.class;
                        } else return false;
                        break;
                    default:
                        return false;
                }
            }
        }
        return true;
    }

    private static Class<?>[] getParameters(Object... params) {
        int i = 0;
        Class<?>[] parameters = new Class[params.length];
        for (Object param : params) {
            parameters[i] = param.getClass();
            i++;
        }
        return parameters;
    }
}