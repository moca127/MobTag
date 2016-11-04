package kr.mocha.command;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.utils.Config;
import cn.nukkit.utils.TextFormat;
import kr.mocha.MobTag;

/**
 * Created by mocha on 16. 11. 4.
 */
public class MobTagCommand extends Command{
    public Config tagDB = MobTag.getInstance().tagDB;

    public MobTagCommand(){
        super("mobtag", "몹의 칭호를 설정합니다.", "/mobtag <set|list>", new String[]{"mt","몬스터태그","칭호","몹태그","몹칭호","mobtag"});
        this.setPermission("mobtag.cmd");
    }

    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        try{
            if(args[0].toLowerCase().equalsIgnoreCase("set")){
                switch (args[1]){
                    case "좀비":
                    case "zombie":
                    case "z":
                        tagDB.set("Zombie", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Zombie의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "silverfish":
                    case "silver":
                    case "좀벌레":
                        tagDB.set("Silverfish", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Silverfish의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "skeleton":
                    case "s":
                    case "스켈레톤":
                        tagDB.set("Blaze", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Blaze의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "blaze":
                    case "b":
                    case "블레이즈":
                        tagDB.set("Skeleton", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Skeleton의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "irongolem":
                    case "ig":
                    case "골렘":
                        tagDB.set("IronGolem", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]IronGolem의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "wolf":
                    case "w":
                    case "늑대":
                    case "개":
                        tagDB.set("Wolf", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Wolf의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "ocelot":
                    case "o":
                    case "오셀롯":
                        tagDB.set("Ocelot", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Ocelot의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "rabbit":
                    case "r":
                    case "토끼":
                        tagDB.set("Rabbit", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Rabbit의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "cow":
                    case "c":
                    case "소":
                        tagDB.set("Cow", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Cow의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "pig":
                    case "p":
                    case "돼지":
                        tagDB.set("Pig", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Pig의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "sheep":
                    case "sh":
                    case "양":
                        tagDB.set("Sheep", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Sheep의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "chicken":
                    case "ch":
                    case "닭":
                        tagDB.set("Chicken", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Chicken의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "zombiepigman":
                    case "zp":
                    case "좀비피그맨":
                    case "좀비남자":
                    case "돼지좀비":
                        tagDB.set("ZombiePigman", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]ZombiePigman의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "snowgolem":
                    case "sg":
                    case "스노우골렘":
                    case "눈골렘":
                    case "눈사람":
                        tagDB.set("SnowGolem", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]SnowGolem의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "creeper":
                    case "cr":
                    case "크리퍼":
                        tagDB.set("Creeper", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Creeper의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "spider":
                    case "sp":
                    case "거미":
                        tagDB.set("Spider", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Spider의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "slime":
                    case "sl":
                    case "슬라임":
                        tagDB.set("Slime", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Slime의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "enderman":
                    case "em":
                    case "e":
                    case "ender":
                    case "엔더맨":
                    case "엔더":
                        tagDB.set("EnderMan", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]EnderMan의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "cavespider":
                    case "cs":
                    case "동굴거미":
                        tagDB.set("CaveSpider", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]CaveSpider의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "gast":
                    case "g":
                    case "가스트":
                        tagDB.set("Gast", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]Gast의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "mooshroom":
                    case "mr":
                    case "버섯소":
                    case "버섯":
                    case "좀비소":
                        tagDB.set("MooshRoom", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]MooshRoom의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    case "magmacube":
                    case "m":
                    case "mm":
                    case "마그마큐브":
                        tagDB.set("MagmaCube", args[2]);
                        sender.sendMessage(TextFormat.AQUA+"[알림]MagmaCube의 칭호를 "+args[1]+"으로 변경하였습니다.");
                        tagDB.save();
                        break;
                    default:
                        sender.sendMessage(TextFormat.RED+this.getUsage());
                        break;
                }
            }
            else if(args[0].equalsIgnoreCase("list")){
                sender.sendMessage(TextFormat.GREEN+"=== Mob Tag ===");
                for(String s : tagDB.getKeys()){
                    sender.sendMessage(s+" : "+tagDB.get(s).toString());
                }
            }else sender.sendMessage(TextFormat.RED+this.getUsage());
        }catch (ArrayIndexOutOfBoundsException e){
            sender.sendMessage(TextFormat.RED+this.getUsage());
        }
        return false;
    }
}
