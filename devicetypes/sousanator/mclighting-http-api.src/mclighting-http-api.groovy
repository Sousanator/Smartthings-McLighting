/**
 *  Copyright 2015 SmartThings
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
 

metadata {
	definition (name: "McLighting HTTP API", namespace: "Sousanator", author: "Sousanator") {
		capability "Switch"
		capability "Switch Level"
		capability "Light"
		capability "Color Control"
		
        command "on"
		command "off"
        command "setColor"
		command "setLevel"
        command "setSpeed"
		command "setScene" 
		
        command "levelDecrement"
		command "levelIncrement"
        command "speedDecrement"
		command "speedIncrement"
		command "sceneDecrement"
		command "sceneIncrement"
		
        command "setPreset1"
		command "setPreset2"
		command "setPreset3"	
        command "setPreset4"
		command "setPreset5"
		command "setPreset6"
        
        command "setScene0"
		command "setScene1"
		command "setScene2"
		command "setScene3"	
        command "setScene4"
		command "setScene5"
		command "setScene6"
        command "setScene7"
		command "setScene8"
		command "setScene9"	
        
        command "setScene10"
		command "setScene11"
		command "setScene12"
		command "setScene13"	
        command "setScene14"
		command "setScene15"
		command "setScene16"
        command "setScene17"
		command "setScene18"
		command "setScene19"	
        
        command "setScene20"
		command "setScene21"
		command "setScene22"
		command "setScene23"	
        command "setScene24"
		command "setScene25"
		command "setScene26"
        command "setScene27"
		command "setScene28"
		command "setScene29"	
        
        command "setScene30"
		command "setScene31"
		command "setScene32"
		command "setScene33"	
        command "setScene34"
		command "setScene35"
		command "setScene36"
        command "setScene37"
		command "setScene38"
		command "setScene39"	
                
        command "setScene40"
		command "setScene41"
		command "setScene42"
		command "setScene43"	
        command "setScene44"
		command "setScene45"
		command "setScene46"
        command "setScene47"
		command "setScene48"
		command "setScene49"	
        
        command "setScene50"
		command "setScene51"
		command "setScene52"
		command "setScene53"	
        command "setScene54"
		command "setScene55"
		command "setScene56"
        command "setScene57"
		command "setScene58"
		command "setScene59"

        command "savePreset1"
		command "savePreset2"
		command "savePreset3"	
        command "savePreset4"
		command "savePreset5"
		command "savePreset6"		
            
		attribute "color", "String"
		attribute "scene", "Number"
		attribute "level", "Number"
		attribute "speed", "Number"
	}

	simulator {

	}
    
	tiles (scale: 2) { 
		// ON + OFF
		standardTile("switch", "switch", width: 3, height: 1, decoration: "flat", canChangeIcon: true) {
			state "off", action: "on", label: "off", icon: "st.switches.switch.off", backgroundColor: "#ffffff"
			state "on", action: "off", label: "on", icon: "st.switches.switch.on", backgroundColor: "#00a0dc"
		}
		
		//COLOR
		valueTile("currentColor", "color", width: 3, height: 1) {
			state "val", label:'${currentValue}', defaultState: true
		}
 		controlTile("rgbSelector", "color", "color", width: 6, height: 6, inactiveLabel: false) {
            state "color", action:"setColor"
        }

		//BRIGHTNESS
		valueTile("levelLabel", "levelLabel", width: 2, height: 1) {
			state "val", label:'Level', defaultState: true
		}
		standardTile("levelDecrement", "level", width: 1, height: 1, decoration: "flat") {
			state "level", label: "", backgroundColor: "#ffffff", action: "levelDecrement", icon: "st.thermostat.thermostat-down"
		} 
		standardTile("levelIncrement", "level", width: 1, height: 1, decoration: "flat") {
			state "level", label: "", backgroundColor: "#ffffff", action: "levelIncrement", icon: "st.thermostat.thermostat-up"
		} 
		controlTile("level", "level", "slider",  width: 2, height: 1, inactiveLabel: false ) {
			state "level", action:"setLevel", label: "Level"
		}
		
		//SPEED
		valueTile("speedLabel", "speedLabel", width: 2, height: 1) {
			state "val", label:'Speed', defaultState: true
		}
		standardTile("speedDecrement", "speed", width: 1, height: 1, decoration: "flat") {
			state "speed", label: "", backgroundColor: "#ffffff", action: "speedDecrement", icon: "st.thermostat.thermostat-down"
		} 
		standardTile("speedIncrement", "speed", width: 1, height: 1, decoration: "flat") {
			state "speed", label: "", backgroundColor: "#ffffff", action: "speedIncrement", icon: "st.thermostat.thermostat-up"
		}     
		controlTile("speed", "speed", "slider",  width: 2, height: 1, decoration: "flat" ) {
			state "speed", action:"setSpeed", label:'Speed'
		}
 

		//PRESETS (saves scene, level, speed, and color)
		standardTile("preset1", "preset1", width: 1, height: 1, decoration: "flat") {
        	state "val", label: '${currentValue}', backgroundColor: "#C0C0C0", action: "setPreset1" 
        }    
        standardTile("preset2", "preset2", width: 1, height: 1, decoration: "flat") {
        	state "val", label: '${currentValue}', backgroundColor: "#C0C0C0", action: "setPreset2" 
		}
        standardTile("preset3", "preset3", width: 1, height: 1, decoration: "flat") {
        	state "val", label: '${currentValue}', backgroundColor: "#C0C0C0", action: "setPreset3" 
        }
        standardTile("preset4", "preset4", width: 1, height: 1, decoration: "flat") {
        	state "val", label: '${currentValue}', backgroundColor: "#C0C0C0", action: "setPreset4" 
        }
		standardTile("preset5", "preset5", width: 1, height: 1, decoration: "flat") {
        	state "val", label: '${currentValue}', backgroundColor: "#C0C0C0", action: "setPreset5" 
        }
        standardTile("preset6", "preset6", width: 1, height: 1, decoration: "flat") {
        	state "val", label: '${currentValue}', backgroundColor: "#C0C0C0", action: "setPreset6" 
        }
        
        standardTile("SAVEpreset1", "SAVEpreset1", width: 1, height: 1, decoration: "flat") {
        	state "val", label: 'Save Preset 1', backgroundColor: "#ffffff", action: "savePreset1" 
        }    
        standardTile("SAVEpreset2", "SAVEpreset2", width: 1, height: 1, decoration: "flat") {
        	state "val", label: 'Save Preset 2', backgroundColor: "#ffffff", action: "savePreset2" 
		}
        standardTile("SAVEpreset3", "SAVEpreset3", width: 1, height: 1, decoration: "flat") {
        	state "val", label: 'Save Preset 3', backgroundColor: "#ffffff", action: "savePreset3" 
        }
        standardTile("SAVEpreset4", "SAVEpreset4", width: 1, height: 1, decoration: "flat") {
        	state "val", label: 'Save Preset 4', backgroundColor: "#ffffff", action: "savePreset4" 
        }
		standardTile("SAVEpreset5", "SAVEpreset5", width: 1, height: 1, decoration: "flat") {
        	state "val", label: 'Save Preset 5', backgroundColor: "#ffffff", action: "savePreset5" 
        }
        standardTile("SAVEpreset6", "SAVEpreset6", width: 1, height: 1, decoration: "flat") {
        	state "val", label: 'Save Preset 6', backgroundColor: "#ffffff", action: "savePreset6" 
        }


		//SCENES
		standardTile("scene0", "scene0", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '0-Static', backgroundColor: "#ffffff", action: "setScene0" 
        }
		standardTile("scene1", "scene1", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '1- Blink', backgroundColor: "#ffffff", action: "setScene1" 
        }    
        standardTile("scene2", "scene2", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '2- Breath', backgroundColor: "#ffffff", action: "setScene2" 
		}
        standardTile("scene3", "scene3", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '3- Color Wipe', backgroundColor: "#ffffff", action: "setScene3" 
        }
        standardTile("scene4", "scene4", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '4- Color Wipe Inverse', backgroundColor: "#ffffff", action: "setScene4" 
        }
		standardTile("scene5", "scene5", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '5- Color Wipe Reverse', backgroundColor: "#ffffff", action: "setScene5" 
        }
        standardTile("scene6", "scene6", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '6- Color Wipe Reverse Inverse', backgroundColor: "#ffffff", action: "setScene6" 
        }
        standardTile("scene7", "scene7", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '7- Color Wipe Random', backgroundColor: "#ffffff", action: "setScene7" 
        }
        standardTile("scene8", "scene8", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '8- Random Color', backgroundColor: "#ffffff", action: "setScene8" 
        }
        standardTile("scene9", "scene9", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '9- Single Dynamic', backgroundColor: "#ffffff", action: "setScene9" 
        }
        
        standardTile("scene10", "scene10", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '10- Multi Dynamic', backgroundColor: "#ffffff", action: "setScene10" 
        }
		standardTile("scene11", "scene11", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '11- Rainbow', backgroundColor: "#ffffff", action: "setScene11" 
        }    
        standardTile("scene12", "scene12", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '12- Rainbow Cycle', backgroundColor: "#ffffff", action: "setScene12" 
		}
        standardTile("scene13", "scene13", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '13- Scan', backgroundColor: "#ffffff", action: "setScene13" 
        }
        standardTile("scene14", "scene14", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '14- Dual Scan', backgroundColor: "#ffffff", action: "setScene14" 
        }
		standardTile("scene15", "scene15", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '15- Fade', backgroundColor: "#ffffff", action: "setScene15" 
        }
        standardTile("scene16", "scene16", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '16- Theather Chase', backgroundColor: "#ffffff", action: "setScene16" 
        }
        standardTile("scene17", "scene17", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '17- Theater Chase Rainbow', backgroundColor: "#ffffff", action: "setScene17" 
        }
        standardTile("scene18", "scene18", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '18- Running Lights', backgroundColor: "#ffffff", action: "setScene18" 
        }
        standardTile("scene19", "scene19", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '19- Twinkle', backgroundColor: "#ffffff", action: "setScene19" 
        }
        
        standardTile("scene20", "scene20", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '20- Twinkle Random', backgroundColor: "#ffffff", action: "setScene20" 
        }
		standardTile("scene21", "scene21", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '21- Twinkle Fade', backgroundColor: "#ffffff", action: "setScene21" 
        }    
        standardTile("scene22", "scene22", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '22- Twinkle Fade Random', backgroundColor: "#ffffff", action: "setScene22" 
		}
        standardTile("scene23", "scene23", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '23- Sparkle', backgroundColor: "#ffffff", action: "setScene23" 
        }
        standardTile("scene24", "scene24", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '24- Sparkle', backgroundColor: "#ffffff", action: "setScene24" 
        }
		standardTile("scene25", "scene25", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '25- Hyper Sparkle', backgroundColor: "#ffffff", action: "setScene25" 
        }
        standardTile("scene26", "scene26", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '26- Strobe', backgroundColor: "#ffffff", action: "setScene26" 
        }
        standardTile("scene27", "scene27", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '27- Strobe Rainbow', backgroundColor: "#ffffff", action: "setScene27" 
        }
        standardTile("scene28", "scene28", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '28- Multi Strobe', backgroundColor: "#ffffff", action: "setScene28" 
        }
        standardTile("scene29", "scene29", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '29- Blink Rainbow', backgroundColor: "#ffffff", action: "setScene29" 
        }
        
        standardTile("scene30", "scene30", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '30- Chase White', backgroundColor: "#ffffff", action: "setScene30" 
        }
		standardTile("scene31", "scene31", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '31- Chase Color', backgroundColor: "#ffffff", action: "setScene31" 
        }    
        standardTile("scene32", "scene32", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '32- Chase Random', backgroundColor: "#ffffff", action: "setScene32" 
		}
        standardTile("scene33", "scene33", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '33- Chase Rainbow', backgroundColor: "#ffffff", action: "setScene33" 
        }
        standardTile("scene34", "scene34", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '34- Chase Flash', backgroundColor: "#ffffff", action: "setScene34" 
        }
		standardTile("scene35", "scene35", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '35- Chase Flash Random', backgroundColor: "#ffffff", action: "setScene35" 
        }
        standardTile("scene36", "scene36", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '36- Chase Rainbow White', backgroundColor: "#ffffff", action: "setScene36" 
        }
        standardTile("scene37", "scene37", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '37- Chase Blackout', backgroundColor: "#ffffff", action: "setScene37" 
        }
        standardTile("scene38", "scene38", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '38- Chase Blackout Rainbow', backgroundColor: "#ffffff", action: "setScene38" 
        }
        standardTile("scene39", "scene39", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '39- Color Sweep Random', backgroundColor: "#ffffff", action: "setScene39" 
        }
        
        standardTile("scene40", "scene40", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '40- Running Color', backgroundColor: "#ffffff", action: "setScene40" 
        }
		standardTile("scene41", "scene41", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '41- Running Red Blue', backgroundColor: "#ffffff", action: "setScene41" 
        }    
        standardTile("scene42", "scene42", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '42- Running Random', backgroundColor: "#ffffff", action: "setScene42" 
		}
        standardTile("scene43", "scene43", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '43- Larson Scanner', backgroundColor: "#ffffff", action: "setScene43" 
        }
        standardTile("scene44", "scene44", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '44- Comet', backgroundColor: "#ffffff", action: "setScene44" 
        }
		standardTile("scene45", "scene45", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '45- Fireworks', backgroundColor: "#ffffff", action: "setScene45" 
        }
        standardTile("scene46", "scene46", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '46- Fireworks Random', backgroundColor: "#ffffff", action: "setScene46" 
        }
        standardTile("scene47", "scene47", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '47- Merry Christmas', backgroundColor: "#ffffff", action: "setScene47" 
        }
        standardTile("scene48", "scene48", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '48- Fire Flicker', backgroundColor: "#ffffff", action: "setScene48" 
        }
        standardTile("scene49", "scene49", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '49- Fire Flicker (soft)', backgroundColor: "#ffffff", action: "setScene49" 
        }
        
        standardTile("scene50", "scene50", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '50- Fire Flicker (Intense)', backgroundColor: "#ffffff", action: "setScene50" 
        }
		standardTile("scene51", "scene51", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '51- Circus Combustus', backgroundColor: "#ffffff", action: "setScene51" 
        }    
        standardTile("scene52", "scene52", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '52- Halloween', backgroundColor: "#ffffff", action: "setScene52" 
		}
        standardTile("scene53", "scene53", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '53- BiColor Chase', backgroundColor: "#ffffff", action: "setScene53" 
        }
        standardTile("scene54", "scene54", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '54- TriColor Chase', backgroundColor: "#ffffff", action: "setScene54" 
        }
		standardTile("scene55", "scene55", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '55- ICU', backgroundColor: "#ffffff", action: "setScene55" 
        }
        standardTile("scene56", "scene56", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '56- Custom 0', backgroundColor: "#ffffff", action: "setScene56" 
        }
        standardTile("scene57", "scene57", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '57- Custom 1', backgroundColor: "#ffffff", action: "setScene57" 
        }
        standardTile("scene58", "scene58", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '58- Custom 2', backgroundColor: "#ffffff", action: "setScene58" 
        }
        standardTile("scene59", "scene59", width: 2, height: 1, decoration: "flat") {
        	state "val", label: '59- Custom 3', backgroundColor: "#ffffff", action: "setScene59" 
        }
		
		standardTile("sceneDecrement", "scene", width: 1, height: 1, decoration: "flat") {
			state "default", label: "", backgroundColor: "#ffffff", action: "sceneDecrement", icon: "st.thermostat.thermostat-left"
		} 
		valueTile("currentScene", "scene", width: 4, height: 1, decoration: "flat") {
			state "val", label: '${currentValue}', backgroundColor: "#ffffff"
		} 
		standardTile("sceneIncrement", "scene", width: 1, height: 1, decoration: "flat") {
			state "default", label: "", backgroundColor: "#ffffff", action: "sceneIncrement", icon: "st.thermostat.thermostat-right"
		} 
       
          
		main "switch"
			details([
			"switch","currentColor","rgbSelector", 
            "levelLabel", "levelDecrement","levelIncrement", "level", 
            "speedLabel", "speedDecrement","speedIncrement", "speed",
            "preset1","preset2","preset3","preset4","preset5","preset6",
            
            "sceneDecrement","currentScene","sceneIncrement",
            
            "scene0","scene1","scene2",
            "scene3","scene4","scene5",
            "scene6","scene7","scene8",
            "scene9","scene10","scene11",
            
            "scene12","scene13","scene14",
            "scene15","scene16","scene17",
            "scene18","scene19","scene20",
            "scene21","scene22","scene23",
            
            "scene24","scene25","scene26",
            "scene27","scene28","scene29",
            "scene30","scene31","scene32",
            "scene33","scene34","scene35",
            
            "scene36","scene37","scene38",
            "scene39","scene40","scene41",
            "scene42","scene43","scene44",
            "scene45","scene46","scene47",
            
            "scene48","scene49","scene50",
            "scene51","scene52","scene53",
            "scene54","scene55","scene56",
            "scene57","scene58","scene59",
            "SAVEpreset1","SAVEpreset2","SAVEpreset3","SAVEpreset4","SAVEpreset5","SAVEpreset6",
            ])
	}

    preferences {
        input name: "internal_ip", type: "text", title: "Internal IP", required: true
		input name: "internal_port", type: "text", title: "Internal Port", defaultValue: 80, required: true
        	      
	}
}


/*
=============================================
ON/OFF
=============================================
*/
def off() {
	sendEvent(name: "switch", value: "off", isStateChange: true)
    log.debug("Turn OFF")
	return sendGetRequest("/off")
} 
def on() {
    sendEvent(name: "switch", value: "on", isStateChange: true)
	sendEvent(name: "scene", value: "Scene: ${state.SavedScene}", isStateChange: true)
    log.debug("Turn ON + Scene:${state.SavedScene}, Color:${state.SavedColor}")
	return sendGetRequest("/set_mode?m=${state.SavedScene}&rgb=${state.SavedColor}" )
}


/*
=============================================
SCENES
=============================================
*/

def setScene(Integer scene) {
    state.SavedScene = scene
    sendEvent(name: "scene", value: "Scene: ${scene}", isStateChange: true)//,
    sendEvent(name: "switch", value: "on", isStateChange: true)
       
    log.debug("Set Scene:${state.SavedScene} + Color:${state.SavedColor}, Speed:${state.SavedSpeed}")
    return sendGetRequest("/set_mode?m=${scene}&rgb=${state.SavedColor}&s=${state.SavedSpeed}")   
}

def sceneDecrement() {
  	def index = state.SavedScene.toInteger();
  	
  	index--
  	if(index == -1) { index = 0; }	
	setScene(index)
}

def sceneIncrement() {
  	def index = state.SavedScene.toInteger();

  	index++
  	if(index == 60) { index = 59; }	
	setScene(index)
}

	def setScene0() {
		sendEvent(name: "scene0", value: "${scene0}")
		setScene(0)
	} 
	def setScene1() {
		sendEvent(name: "scene1", value: "${scene1}")
		setScene(1)
	}    
	def setScene2() {    	
		sendEvent(name: "scene2", value: "${scene2}")
		setScene(2)    	
	} 
	def setScene3() {
		sendEvent(name: "scene3", value: "${scene3}")
		setScene(3)
	} 
	def setScene4() {
		sendEvent(name: "scene4", value: "${scene4}")
		setScene(4)
	}
	def setScene5() {
		sendEvent(name: "scene5", value: "${scene5}")
		setScene(5)
	}
	def setScene6() {
		sendEvent(name: "scene6", value: "${scene6}")
		setScene(6)
	}
	def setScene7() {
		sendEvent(name: "scene7", value: "${scene7}")
		setScene(7)
	}
	def setScene8() {
		sendEvent(name: "scene8", value: "${scene8}")
		setScene(8)
	}
	def setScene9() {
		sendEvent(name: "scene9", value: "${scene9}")
		setScene(9)
	}
	def setScene10() {
		sendEvent(name: "scene10", value: "${scene10}")
		setScene(10)
	} 
	def setScene11() {
		sendEvent(name: "scene11", value: "${scene11}")
		setScene(11)
	}    
	def setScene12() {    	
		sendEvent(name: "scene12", value: "${scene12}")
		setScene(12)    	
	} 
	def setScene13() {
		sendEvent(name: "scene13", value: "${scene13}")
		setScene(13)
	} 
	def setScene14() {
		sendEvent(name: "scene14", value: "${scene14}")
		setScene(14)
	}
	def setScene15() {
		sendEvent(name: "scene15", value: "${scene15}")
		setScene(15)
	}
	def setScene16() {
		sendEvent(name: "scene16", value: "${scene16}")
		setScene(16)
	}
	def setScene17() {
		sendEvent(name: "scene17", value: "${scene17}")
		setScene(17)
	}
	def setScene18() {
		sendEvent(name: "scene18", value: "${scene18}")
		setScene(18)
	}
	def setScene19() {
		sendEvent(name: "scene19", value: "${scene19}")
		setScene(19)
	}

	def setScene20() {
		sendEvent(name: "scene20", value: "${scene20}")
		setScene(20)
	} 
	def setScene21() {
		sendEvent(name: "scene21", value: "${scene21}")
		setScene(21)
	}    
	def setScene22() {    	
		sendEvent(name: "scene22", value: "${scene22}")
		setScene(22)    	
	} 
	def setScene23() {
		sendEvent(name: "scene23", value: "${scene23}")
		setScene(23)
	} 
	def setScene24() {
		sendEvent(name: "scene24", value: "${scene24}")
		setScene(24)
	}
	def setScene25() {
		sendEvent(name: "scene25", value: "${scene25}")
		setScene(25)
	}
	def setScene26() {
		sendEvent(name: "scene26", value: "${scene26}")
		setScene(26)
	}
	def setScene27() {
		sendEvent(name: "scene27", value: "${scene27}")
		setScene(27)
	}
	def setScene28() {
		sendEvent(name: "scene28", value: "${scene28}")
		setScene(28)
	}
	def setScene29() {
		sendEvent(name: "scene29", value: "${scene29}")
		setScene(29)
	}
	def setScene30() {
		sendEvent(name: "scene30", value: "${scene30}")
		setScene(30)
	} 
	def setScene31() {
		sendEvent(name: "scene31", value: "${scene31}")
		setScene(31)
	}    
	def setScene32() {    	
		sendEvent(name: "scene32", value: "${scene32}")
		setScene(32)    	
	} 
	def setScene33() {
		sendEvent(name: "scene33", value: "${scene33}")
		setScene(33)
	} 
	def setScene34() {
		sendEvent(name: "scene34", value: "${scene34}")
		setScene(34)
	}
	def setScene35() {
		sendEvent(name: "scene35", value: "${scene35}")
		setScene(35)
	}
	def setScene36() {
		sendEvent(name: "scene36", value: "${scene36}")
		setScene(36)
	}
	def setScene37() {
		sendEvent(name: "scene37", value: "${scene37}")
		setScene(37)
	}
	def setScene38() {
		sendEvent(name: "scene38", value: "${scene38}")
		setScene(38)
	}
	def setScene39() {
		sendEvent(name: "scene39", value: "${scene39}")
		setScene(39)
	}
	def setScene40() {
		sendEvent(name: "scene40", value: "${scene40}")
		setScene(40)
	} 
	def setScene41() {
		sendEvent(name: "scene41", value: "${scene41}")
		setScene(41)
	}    
	def setScene42() {    	
		sendEvent(name: "scene42", value: "${scene42}")
		setScene(42)    	
	} 
	def setScene43() {
		sendEvent(name: "scene43", value: "${scene43}")
		setScene(43)
	} 
	def setScene44() {
		sendEvent(name: "scene44", value: "${scene44}")
		setScene(44)
	}
	def setScene45() {
		sendEvent(name: "scene45", value: "${scene45}")
		setScene(45)
	}
	def setScene46() {
		sendEvent(name: "scene46", value: "${scene46}")
		setScene(46)
	}
	def setScene47() {
		sendEvent(name: "scene47", value: "${scene47}")
		setScene(47)
	}
	def setScene48() {
		sendEvent(name: "scene48", value: "${scene48}")
		setScene(48)
	}
	def setScene49() {
		sendEvent(name: "scene49", value: "${scene49}")
		setScene(49)
	}
	def setScene50() {
		sendEvent(name: "scene50", value: "${scene50}")
		setScene(50)
	} 
	def setScene51() {
		sendEvent(name: "scene51", value: "${scene51}")
		setScene(51)
	}    
	def setScene52() {    	
		sendEvent(name: "scene52", value: "${scene52}")
		setScene(52)    	
	} 
	def setScene53() {
		sendEvent(name: "scene53", value: "${scene53}")
		setScene(53)
	} 
	def setScene54() {
		sendEvent(name: "scene54", value: "${scene54}")
		setScene(54)
	}
	def setScene55() {
		sendEvent(name: "scene55", value: "${scene55}")
		setScene(55)
	}
	def setScene56() {
		sendEvent(name: "scene56", value: "${scene56}")
		setScene(56)
	}
	def setScene57() {
		sendEvent(name: "scene57", value: "${scene57}")
		setScene(57)
	}
	def setScene58() {
		sendEvent(name: "scene58", value: "${scene58}")
		setScene(58)
	}
	def setScene59() {
		sendEvent(name: "scene59", value: "${scene59}")
		setScene(59)
	}



/*
=============================================
PRESETS
=============================================
*/
def setPreset(PresetColor, PresetLevel, PresetSpeed, PresetScene, PresetSpeed100) {
	//log.debug(value)
    sendEvent(name: "switch", value: "on", isStateChange: true)
    sendEvent(name: "scene", value: "Scene: ${state.SavedScene}", isStateChange: true)
   	
    sendEvent(name: "currentColor", value: "#${PresetColor}", isStateChange: true)
    sendEvent(name: "color", value: "#${PresetColor}", isStateChange: true)
    
    sendEvent(name: "speed", value: PresetSpeed100, isStateChange: true)
    sendEvent(name: "level", value: PresetLevel, isStateChange: true)
    
    log.debug("Set Preset = Color:${PresetColor} + Scene:${PresetScene},Level:${PresetLevel},Speed:${PresetSpeed}")
	return sendGetRequest("/set_mode?m=${PresetScene}&rgb=${PresetColor}&c=${PresetLevel}&s=${PresetSpeed}" )
}


def setPreset1() {
	sendEvent(name: "preset1", isStateChange: true)
    log.debug("Preset 1")
    setPreset(state.Preset1Color, state.Preset1Level, state.Preset1Speed, state.Preset1Scene, state.Preset1Speed100)
}    
def setPreset2() {    	
 	sendEvent(name: "preset2", isStateChange: true)
    log.debug("Preset 2")
    setPreset(state.Preset2Color, state.Preset2Level, state.Preset2Speed, state.Preset2Scene, state.Preset1Speed100)
} 
def setPreset3() {
	sendEvent(name: "preset3", isStateChange: true)
    log.debug("Preset 3")
	setPreset(state.Preset3Color, state.Preset3Level, state.Preset3Speed, state.Preset3Scene, state.Preset1Speed100)
} 
def setPreset4() {
	sendEvent(name: "preset4", isStateChange: true)
    log.debug("Preset 4")
    setPreset(state.Preset4Color, state.Preset4Level, state.Preset4Speed, state.Preset4Scene, state.Preset1Speed100)
}
def setPreset5() {
	sendEvent(name: "preset5", isStateChange: true)
    log.debug("Preset 5")
    setPreset(state.Preset5Color, state.Preset5Level, state.Preset5Speed, state.Preset5Scene, state.Preset1Speed100)
}
def setPreset6() {
	sendEvent(name: "preset6", isStateChange: true)
    log.debug("Preset 6")
     setPreset(state.Preset6Color, state.Preset6Level, state.Preset6Speed, state.Preset6Scene, state.Preset1Speed100)
}

def savePreset1() {
	state.Preset1Color = state.SavedColor
    state.Preset1Level = state.SavedLevel
    state.Preset1Speed = state.SavedSpeed
    state.Preset1Speed100 = state.SavedSpeed100
    state.Preset1Scene = state.SavedScene
    sendEvent(name: "preset1", value: "#${state.Preset1Color} Scene:${state.Preset1Scene} Speed:${state.Preset1Speed100}", isStateChange: true)
    log.debug("SAVE Preset 1 Color:${state.Preset1Color} + Scene:${state.Preset1Scene},Level:${state.Preset1Level},Speed:${state.Preset1Speed100}")
}    
def savePreset2() {    	
    state.Preset2Color = state.SavedColor
    state.Preset2Level = state.SavedLevel
    state.Preset2Speed = state.SavedSpeed
    state.Preset2Speed100 = state.SavedSpeed100
    state.Preset2Scene = state.SavedScene
    sendEvent(name: "preset2", value: "#${state.Preset2Color} Scene:${state.Preset2Scene} Speed:${state.Preset2Speed100}", isStateChange: true)
    log.debug("SAVE Preset 2 Color:${state.Preset2Color} + Scene:${state.Preset2Scene},Level:${state.Preset2Level},Speed:${state.Preset2Speed100}")
} 
def savePreset3() {
	state.Preset3Color = state.SavedColor
    state.Preset3Level = state.SavedLevel
    state.Preset3Speed = state.SavedSpeed
    state.Preset3Speed100 = state.SavedSpeed100
    state.Preset3Scene = state.SavedScene
    sendEvent(name: "preset3", value: "#${state.Preset3Color} Scene:${state.Preset3Scene} Speed:${state.Preset3Speed100}", isStateChange: true)
    log.debug("SAVE Preset 3 Color:${state.Preset3Color} + Scene:${state.Preset3Scene},Level:${state.Preset3Level},Speed:${state.Preset3Speed100}")
} 
def savePreset4() {
	state.Preset4Color = state.SavedColor
    state.Preset4Level = state.SavedLevel
    state.Preset4Speed = state.SavedSpeed
    state.Preset4Speed100 = state.SavedSpeed100
    state.Preset4Scene = state.SavedScene
    sendEvent(name: "preset4", value: "#${state.Preset4Color} Scene:${state.Preset4Scene} Speed:${state.Preset4Speed100}", isStateChange: true)
    log.debug("SAVE Preset 4 Color:${state.Preset4Color} + Scene:${state.Preset4Scene},Level:${state.Preset4Level},Speed:${state.Preset4Speed100}")
}
def savePreset5() {
	state.Preset5Color = state.SavedColor
    state.Preset5Level = state.SavedLevel
    state.Preset5Speed = state.SavedSpeed
    state.Preset5Speed100 = state.SavedSpeed100
    state.Preset5Scene = state.SavedScene
    sendEvent(name: "preset5", value: "#${state.Preset5Color} Scene:${state.Preset5Scene} Speed:${state.Preset5Speed100}", isStateChange: true)
    log.debug("SAVE Preset 5 Color:${state.Preset5Color} + Scene:${state.Preset5Scene},Level:${state.Preset5Level},Speed:${state.Preset5Speed100}")
}
def savePreset6() {
    state.Preset6Color = state.SavedColor
    state.Preset6Level = state.SavedLevel
    state.Preset6Speed = state.SavedSpeed
    state.Preset6Speed100 = state.SavedSpeed100
    state.Preset6Scene = state.SavedScene
    sendEvent(name: "preset6", value: "#${state.Preset6Color} Scene:${state.Preset6Scene} Speed:${state.Preset6Speed100}", isStateChange: true)
    log.debug("SAVE Preset 6 Color:${state.Preset6Color} + Scene:${state.Preset6Scene},Level:${state.Preset6Level},Speed:${state.Preset6Speed100}")
}

/*
=============================================
BRIGHTNESS LEVEL
=============================================
*/
def setLevel(Integer value) {
    state.SavedLevel = value
    
    sendEvent(name: "switch", value: "on", isStateChange: true)
    sendEvent(name: "scene", value: "Scene: ${state.SavedScene}", isStateChange: true)
    sendEvent(name: "level", value: state.SavedLevel, isStateChange: true)
    
	log.debug("Set Brightness:${value} + Scene:${state.SavedScene}, Color:${state.SavedColor}, Speed:${state.SavedSpeed}")
	return sendGetRequest("/set_mode?m=${state.SavedScene}&rgb=${state.SavedColor}&c=${value}&s=${state.SavedSpeed}")
}
def levelDecrement() {
  	def index = state.SavedLevel

  	index--
  	if(index == -1) { index = 0; }
	log.debug("Decrement Level")
	setLevel(index)
}
def levelIncrement() {
  	def index = state.SavedLevel;
 
  	index++
  	if(index == 101) { index = 100;	}
	log.debug("Increment Level")
	setLevel(index)
}

/*
=============================================
SPEED
=============================================
*/
def setSpeed(Integer value) {
    sendEvent(name: "switch", value: "on", isStateChange: true)
    sendEvent(name: "scene", value: "Scene: ${state.SavedScene}", isStateChange: true)
    sendEvent(name: "speed", value: value, isStateChange: true)
    state.SavedSpeed100 = value
    state.SavedSpeed = ((value/100)*255).toInteger()
    
	log.debug("Set Speed:${value} (Actual:${state.SavedSpeed}) + Scene:${state.SavedScene}, Color:${state.SavedColor}")
	return sendGetRequest("/set_mode?m=${state.SavedScene}&rgb=${state.SavedColor}&s=${state.SavedSpeed}")
}
def speedDecrement() {
  	def index = state.SavedSpeed100

  	index--
  	if(index == -1) { index = 0; }
	log.debug("Decrement Speed")
	setSpeed(index)
}
def speedIncrement() {
  	def index = state.SavedSpeed100
    
  	index++
  	if(index == 101) { index = 100; }
	log.debug("Increment Speed")
	setSpeed(index)
}


/*
=============================================
COLOR
=============================================
*/ 

def setColor(value) {
	if (value.hex){
        state.SavedColor = value.hex-"#" //remove # from string
    } else {
        def colorRGB = HSLtoHEX(value.hue, value.saturation, 0.5)
        log.debug("Converting Hue:${value.hue} and Saturation:${value.saturation} to HEX:${colorRGB}")
        state.SavedColor = colorRGB 
    } 
    
    sendEvent(name: "switch", value: "on", isStateChange: true)
    sendEvent(name: "scene", value: "Scene: ${state.SavedScene}", isStateChange: true)
    sendEvent(name: "currentColor", value: "#${state.SavedColor}", isStateChange: true)
    sendEvent(name: "color", value: "#${state.SavedColor}", isStateChange: true)
    sendEvent(name: "speed", value: state.SavedSpeed100, isStateChange: true)
    
    log.debug("Set Color:${state.SavedColor} + Scene:${state.SavedScene},Speed:${state.SavedSpeed}")
	return sendGetRequest( "/set_mode?m=${state.SavedScene}&rgb=${state.SavedColor}&s=${state.SavedSpeed}" )
}

private HSLtoHEX(float var_h, float var_s, float var_l) {
	float h = var_h / 100
    float s = var_s / 100
    float l = var_l
    
    def r = 0
    def g = 0
    def b = 0
    
	if (s == 0) {
    	r = l * 255
        g = l * 255
        b = l * 255
	} else {
    	float var_2 = 0
    	if (l < 0.5) {
        	var_2 = l * (1 + s)
        } else {
        	var_2 = (l + s) - (s * l)
        }
                
        float var_1 = 2 * l - var_2
        
        r = 255 * hueToRgb(var_1, var_2, h + (1 / 3))
        g = 255 * hueToRgb(var_1, var_2, h)
        b = 255 * hueToRgb(var_1, var_2, h - (1 / 3))    
    }
    
    def hexr = hex(r)
    def hexg = hex(g)
    def hexb = hex(b)
    def hexColor = "${hexr}${hexg}${hexb}"
    
    return(hexColor)

}
private hueToRgb(v1, v2, vh) {
	if (vh < 0) { vh += 1 }            
	if (vh > 1) { vh -= 1 }
	if ((6 * vh) < 1) { return (v1 + (v2 - v1) * 6 * vh) }
    if ((2 * vh) < 1) { return (v2) }
    if ((3 * vh) < 2) { return (v1 + (v2 - v1) * ((2 / 3 - vh) * 6)) }    
    return(v1)
}
private hex(value, width=2) {
	def s = new BigInteger(Math.round(value).toString()).toString(16)
	while (s.size() < width) {
		s = "0" + s
	}
	s
}


/*
=============================================
HTTP SEND
=============================================
*/ 

private sendGetRequest(String url) {
	log.debug("${internal_ip}:${internal_port}${url}")
    
    def result = new physicalgraph.device.HubAction(
        method: "GET",
		path: "${url}",
        headers: [
            HOST: "${internal_ip}:${internal_port}" 
			]
        )
    //return result;
}

