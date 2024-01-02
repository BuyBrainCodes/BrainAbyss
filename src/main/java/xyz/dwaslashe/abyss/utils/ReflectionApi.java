package xyz.dwaslashe.abyss.utils;

import lombok.SneakyThrows;
import org.bukkit.Bukkit;
import org.bukkit.command.SimpleCommandMap;
import java.lang.reflect.Field;

public class ReflectionApi {

    public static String getVersion(){
        return Bukkit.getServer().getClass().getPackage().getName().substring(23);
    }

    public static String getObcPath(){
        return "org.bukkit.craftbukkit." + getVersion() + ".";
    }

    private static final Class<?> CraftServerClass = getClass(getObcPath() + "CraftServer");
    private static final Field commandMap = getField(CraftServerClass, "commandMap");

    public static Class<?> getClass(String name){
        try {
            return Class.forName(name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @SneakyThrows
    public static SimpleCommandMap getCommandMap(){
        return (SimpleCommandMap) commandMap.get(Bukkit.getServer());
    }

    public static Field getField(Class<?> clazz, String fieldName, Class<?> type){
        for (Field declaredField : clazz.getDeclaredFields()) {
            declaredField.setAccessible(true);
            if(declaredField.getName().equals(fieldName) && (type == null || declaredField.getType().equals(type))) {
                return declaredField;
            } else declaredField.setAccessible(false);
        }
        return null;
    }

    public static Field getField(Class<?> clazz, String fieldName){
        return getField(clazz, fieldName, null);
    }

}
