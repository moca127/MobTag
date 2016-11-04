package kr.mocha;

import java.util.LinkedHashMap;

import cn.nukkit.entity.Entity;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntitySpawnEvent;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import kr.mocha.command.MobTagCommand;

public class MobTag extends PluginBase implements Listener{
	public static MobTag instance;
	public Config tagDB; //Config 파일을 사용하기위해 선언

	@SuppressWarnings("deprecation")//사용을 권장하지 않음
	@Override
	public void onEnable() {
		instance = this;
		this.getServer().getPluginManager().registerEvents(this, this);
		getDataFolder().mkdirs();
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("Zombie","§a좀비");
		map.put("Silverfish","§a좀벌레");
		map.put("Blaze","§c블레이즈");
		map.put("Skeleton","§a스켈레톤");
		map.put("IronGolem","§a수호자");
		map.put("SnowGolem", "§f눈사람");
		map.put("Wolf","§a늑대");
		map.put("Ocelot","§b오셀롯");
		map.put("Rabbit","§a토끼");
		map.put("Cow","§a소");
		map.put("Pig","§a돼지");
		map.put("Sheep","§a양");
		map.put("Chicken","§b닭");
		map.put("ZombiePigman","§a좀비피그맨");
		map.put("Creeper","§a크리퍼");
		map.put("Spider","§a거미");
		map.put("Slime","§a젤리");
		map.put("EnderMan","§a엔더맨");
		map.put("CaveSpider","§a거미");
		map.put("Gast","§a젤리");
		map.put("MagmaCube", "§a마그마큐브");
		map.put("MooshRoom", "§e버섯소");
		tagDB = new Config(getDataFolder()+"/tagDB.yml",Config.YAML,map);
		this.getServer().getCommandMap().register("mobtag", new MobTagCommand());
		super.onEnable();
	}
	@Override
	public void onDisable() {
		tagDB.save();
		super.onDisable();
	}
	@EventHandler //nukkit 이벤트를 받아오기위한 애너테이션
	public void onSpawn(EntitySpawnEvent event){
		Entity entity = event.getEntity();

		event.getEntity().setNameTagVisible();
		if(!event.isHuman()){
			if(event.getType() == 10){
				entity.setNameTag(this.tagDB.getString("Chicken"));
			}
			else if(event.getType() == 32){
				entity.setNameTag(this.tagDB.getString("Zombie"));		
			}
			else if(event.getType() == 39){
				entity.setNameTag(this.tagDB.getString("Silverfish"));
			}
			else if(event.getType() == 43){
				entity.setNameTag(this.tagDB.getString("Blaze"));
			}
			else if(event.getType() == 34){
				entity.setNameTag(this.tagDB.getString("Skeleton"));
			}
			else if(event.getType() == 20){
				entity.setNameTag(this.tagDB.getString("IronGolem"));
			}
			else if(event.getType() == 14){
				entity.setNameTag(this.tagDB.getString("Wolf"));
			}
			else if(event.getType() == 18){
				entity.setNameTag(this.tagDB.getString("Rabbit"));
			}
			else if(event.getType() == 22){
				entity.setNameTag(this.tagDB.getString("Ocelot"));
			}
			else if(event.getType() == 11){
				entity.setNameTag( this.tagDB.getString("Cow"));
			}
			else if(event.getType() == 12){
				entity.setNameTag( this.tagDB.getString("Pig"));
			}
			else if(event.getType() == 13){
				entity.setNameTag( this.tagDB.getString("Sheep"));
			}
			else if(event.getType() == 36){
				entity.setNameTag( this.tagDB.getString("ZombiePigman"));
			}
			else if(event.getType() == 21){
				entity.setNameTag( this.tagDB.getString("SnowGolem"));
			}
			else if(event.getType() == 33){
				entity.setNameTag( this.tagDB.getString("Creeper"));
			}
			else if(event.getType() == 35){
				entity.setNameTag( this.tagDB.getString("Spider"));
			}
			else if(event.getType() == 37){
				entity.setNameTag( this.tagDB.getString("Slime"));
			}
			else if(event.getType() == 38){
				entity.setNameTag( this.tagDB.getString("EnderMan"));
			}
			else if(event.getType() == 40){
				entity.setNameTag( this.tagDB.getString("CaveSpider"));
			}
			else if(event.getType() == 41){
				entity.setNameTag( this.tagDB.getString("Gast"));
			}
			else if(event.getType() == 42){
				entity.setNameTag( this.tagDB.getString("MagmaCube"));
			}
			else if(event.getType() == 16){
				entity.setNameTag( this.tagDB.getString("MooshRoom"));
			}
		}
	}
	public static MobTag getInstance(){
		return instance;
	}
}
