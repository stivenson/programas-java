/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caracteristicas_letra;
import java.util.*;
/**
 *
 * @author Stivenson
 */
public class Seleccion_Silabas {

static boolean yVoC(char l1,char l2){
    if(l2==' ' && l1== 'y')
        return(true);
        else
        return(false);
}
static char CoOvocal(char letra, char[] frase){
if(letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I'|| letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U'||letra == '\u00e1' || letra == '\u00c1' || letra == '\u00e9' || letra == '\u00c9' || letra == '\u00ed' || letra == '\u00cd'|| letra == '\u00f3' || letra == '\u00d3' || letra == '\u00fa' || letra == '\u00da')
	return('V');
	else
	   {
           if(yVoC(frase[0],frase[1])==true)
           return('V');
           else
           {
            if(letra>='a' && letra<='z' && yVoC(frase[0],frase[1])==false)
	    return('C');
	    else
	    return('O');
           }
	   }
	   }


static boolean Inseparables( char l1,char l2 ){
 if((l1=='r'&&l2=='r')||(l1=='b'&&l2=='l')||(l1=='d'&&l2=='r')||(l1=='c'&&l2=='r')||(l1=='c'&&l2=='l')||(l1=='f'&&l2=='l')||(l1=='f'&&l2=='r')||(l1=='g'&&l2=='l')||(l1=='g'&&l2=='r')||(l1=='t'&&l2=='r')||(l1=='p'&&l2=='l')||(l1=='p'&&l2=='r')||(l1=='c'&&l2=='h')||(l1=='b'&&l2=='r')||(l1=='l'&&l2=='l')||(l1=='q'&&l2=='u')||(l1=='t'&&l2=='l')||(l1=='t'&&l2=='r'))
   return(true);
   else
   return(false);
}

static String TipoVocal(char letra,char[] frase){
if(CoOvocal(letra,frase)=='V'){
    if(letra == 'i' || letra == 'I' || letra == 'U' || letra == 'u')
	return("cerrada");
    else
    {
     if(letra == '\u00ed' || letra == '\u00cd' || letra == '\u00da' || letra == '\u00fa')
     return("cerradatilde");
     else
       {
       	if(letra == '\u00c1' || letra == '\u00e1' || letra == '\u00e9' || letra == '\u00c9'|| letra == '\u00d3' || letra == '\u00f3')
       	return("abiertatilde");
       	else
       	return("abierta");
       }

    }

  }
  else
  return("nada");
}
static boolean Diptongo(char l1, char l2){
if(((l1=='a'||l1=='A') && (l2=='I'||l2=='i'))||((l1=='I'||l1=='i') && (l2=='A'||l2=='a')) || ((l1=='a'||l1=='A') && (l2=='U'||l2=='u'))|| ((l1=='U'||l1=='u') && (l2=='A'||l2=='a')) ||((l1=='E'||l1=='e') && (l2=='I'||l2=='i'))||((l1=='i'||l1=='I') && (l2=='E'||l2=='e'))|| ((l1=='E'||l1=='e') && (l2=='U'||l2=='u'))|| ((l1=='U'||l1=='u') && (l2=='E'||l2=='e')) || ((l1=='O'||l1=='o') && (l2=='U'||l2=='u'))|| ((l1=='U'||l1=='u') && (l2=='O'||l2=='o'))|| ((l1=='O'||l1=='o') && (l2=='I'||l2=='i')) ||((l1=='I'||l1=='i') && (l2=='O'||l2=='o'))|| ((l1=='u'||l1=='U') && (l2=='I'||l2=='i'))|| ((l1=='I'||l1=='i') && (l2=='U'||l2=='u')))
	return(true);
    else
    return(false);
    }

static boolean Triptongo(char l1, char l2, char l3,char[] frase){
if(TipoVocal(l1,frase)=="cerrada" &&( TipoVocal(l2,frase)=="abierta" || TipoVocal(l2,frase)=="abiertatilde" ) && TipoVocal(l3,frase)=="cerrada")
	return(true);
    else
    return(false);
    }

static boolean Hiato(char l1, char l2,char[] frase){
if((TipoVocal(l1,frase)=="cerradatilde" && TipoVocal(l2,frase)=="abierta")|| (TipoVocal(l2,frase)=="cerradatilde" && TipoVocal(l1,frase)=="abierta"))
	return(true);
    else
    return(false);
    }

static boolean V6Letras(char frase[]){
	if(CoOvocal(frase[0],frase)=='C'&&CoOvocal(frase[1],frase)=='C'&&CoOvocal(frase[2],frase)=='V'&&CoOvocal(frase[3],frase)=='V'&&CoOvocal(frase[4],frase)=='V'&&CoOvocal(frase[5],frase)=='C'){
		if(Triptongo(frase[2], frase[3], frase[4],frase)==true)
			return(true);
			else
			return(false);
	}
	else
    return(false);

}
static boolean V5Letras1(char frase[]){
	if(CoOvocal(frase[0],frase)=='C'&&CoOvocal(frase[1],frase)=='C'&&CoOvocal(frase[2],frase)=='V'&&CoOvocal(frase[3],frase)=='C'&&CoOvocal(frase[4],frase)=='C'){
	      if(CoOvocal(frase[5],frase)!='V'){
	      	   if(V6Letras(frase)==false)
	      	   	return(true);
	            else
	            return(false);
	      }
	      else
	      return(false);
	}
	else
	{
   if(CoOvocal(frase[0],frase)=='C'&&CoOvocal(frase[1],frase)=='V'&&CoOvocal(frase[2],frase)=='V'&&CoOvocal(frase[3],frase)=='V'&&CoOvocal(frase[4],frase)=='C'){
 		if(Triptongo(frase[1], frase[2], frase[3],frase)==true){
 		  if(V6Letras(frase)==false){
 		  	  if(Inseparables( frase[4],frase[5] )==false)
 		  	  		return(true);
 	                else
 	                return(false);
 		  }
 	      else
 	      return(false);
 		}
 	    else
 	    return(false);
 	}
 	else
 	return(false);
	}
}

static boolean V5Letras2(char frase[]){
	if(CoOvocal(frase[0],frase)=='C'&&CoOvocal(frase[1],frase)=='C'&&CoOvocal(frase[2],frase)=='V'&&CoOvocal(frase[3],frase)=='V'&&CoOvocal(frase[4],frase)=='C'){
	      if(CoOvocal(frase[5],frase)!='V'){
	      	if(Inseparables( frase[4],frase[5] )==false){
	      		if(Diptongo(frase[2],frase[3])==true){
	      		   if(V6Letras(frase)==false)
	      		   return(true);
	      		   else
	      		   return(false);
	      		}

	      		else
	            return(false);
	      	}
	      	else
	        return(false);

	      }
	      else
	      return(false);
	}
	else
    return(false);
}


static boolean V4Letras1(char frase[]){
	if(CoOvocal(frase[0],frase)=='C'&&CoOvocal(frase[1],frase)=='C'&&CoOvocal(frase[2],frase)=='V'&&CoOvocal(frase[3],frase)=='C'){
	      if(CoOvocal(frase[4],frase)!='V'){
	      	if(Inseparables( frase[3],frase[4] )==false){
	      		if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false)
	      		  		return(true);
	      		        else
	                    return(false);
	      		  }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      	}
	      	else
	        return(false);

	      }
	      else
	      return(false);
	}
	else
    return(false);
}

static boolean V4Letras2(char frase[]){
	if(CoOvocal(frase[0],frase)=='C'&&CoOvocal(frase[1],frase)=='V'&&CoOvocal(frase[2],frase)=='V'&&CoOvocal(frase[3],frase)=='C'){
	      if(CoOvocal(frase[4],frase)!='V'){
	      	if(Inseparables( frase[3],frase[4] )==false){
	      		if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false){
	      		  		if(Diptongo(frase[1], frase[2])==true)
	      		  			return(true);
	      		            else
	                        return(false);
	      		  	}

	      		    else
	                return(false);
	      		  }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      	}
	      	else
	        return(false);

	      }
	      else
	      return(false);
	}
	else
    return(false);
}

static boolean V4Letras3(char frase[]){
	if(CoOvocal(frase[0],frase)=='C'&&CoOvocal(frase[1],frase)=='V'&&CoOvocal(frase[2],frase)=='C'&&CoOvocal(frase[3],frase)=='C'){
	      if(CoOvocal(frase[4],frase)!='V'){
	      	if(Inseparables( frase[2],frase[3] )==false){
	      		if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false){
	      		  		if(Inseparables( frase[3],frase[4] )==false)
	      		  			return(true);
	      		            else
	                        return(false);
	      		  	}

	      		    else
	                return(false);
	      		  }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      	}
	      	else
	        return(false);

	      }
	      else
	      return(false);
	}
	else
    return(false);
}

static boolean V4Letras4(char frase[]){
	if(CoOvocal(frase[0],frase)=='C'&&CoOvocal(frase[1],frase)=='C'&&CoOvocal(frase[2],frase)=='V'&&CoOvocal(frase[3],frase)=='V'){
	      if(Diptongo(frase[2], frase[3])==true){
	      		if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false)
	      		  		return(true);
	      		        else
	                    return(false);
	      		  	}
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      	}
	      	else
	        return(false);
	}
	else
    return(false);
}

static boolean V4Letras5(char frase[]){
	if(CoOvocal(frase[0],frase)=='C'&&CoOvocal(frase[1],frase)=='V'&&CoOvocal(frase[2],frase)=='V'&&CoOvocal(frase[3],frase)=='V'){
	      if(Triptongo(frase[1], frase[2],frase[3],frase)==true){
	      		if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false)
	      		  		return(true);
	      		        else
	                    return(false);
	      		    }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	       }
	       else
	       return(false);
	}
	else
    return(false);
}

static boolean V3Letras1(char frase[]){
	if(CoOvocal(frase[0],frase)=='C'&&CoOvocal(frase[1],frase)=='V'&&CoOvocal(frase[2],frase)=='V'){
	      if(Diptongo(frase[1], frase[2])==true){
	      	if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false){
	      		  		if(V4Letras1(frase)==false){
	      		  			if(V4Letras2(frase)==false){
	      		  			  if(V4Letras3(frase)==false){
	      		  			  	if(V4Letras4(frase)==false){
	      		  			  		if(V4Letras5(frase)==false)
	      		  			  		  return(true);
	      		                       else
	                                  return(false);
	      		  			  	 }
	      		  			  	 else
	                             return(false);
	      		  			   }
	      		  			   else
	                           return(false);
	      		  			}
	      		  			else
	                        return(false);
	      		  		 }
	      		  		 else
	                     return(false);

	      		  	}
	      		  	else
	                return(false);
	      		    }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      }
	      else
	      return(false);
	}
	else
    return(false);
}

static boolean V3Letras2(char frase[]){
	if(CoOvocal(frase[0],frase)=='C'&&CoOvocal(frase[1],frase)=='C'&&CoOvocal(frase[2],frase)=='V'){
	      if(Diptongo(frase[2], frase[3])==false){
	      	if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false){
	      		  		if(V4Letras1(frase)==false){
	      		  			if(V4Letras2(frase)==false){
	      		  			  if(V4Letras3(frase)==false){
	      		  			  	if(V4Letras4(frase)==false){
	      		  			  		if(V4Letras5(frase)==false)
	      		  			  		  return(true);
	      		                       else
	                                  return(false);
	      		  			  	 }
	      		  			  	 else
	                             return(false);
	      		  			   }
	      		  			   else
	                           return(false);
	      		  			}
	      		  			else
	                        return(false);
	      		  		 }
	      		  		 else
	                     return(false);

	      		  	}
	      		  	else
	                return(false);
	      		    }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      }
	      else
	      return(false);
	}
	else
    return(false);
}

static boolean V3Letras3(char frase[]){
	if(CoOvocal(frase[0],frase)=='C'&&CoOvocal(frase[1],frase)=='V'&&CoOvocal(frase[2],frase)=='C'){
	      if(Inseparables( frase[2],frase[3] )==false){
	      	if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false){
	      		  		if(V4Letras1(frase)==false){
	      		  			if(V4Letras2(frase)==false){
	      		  			  if(V4Letras3(frase)==false){
	      		  			  	if(V4Letras4(frase)==false){
	      		  			  		if(V4Letras5(frase)==false){
	      		  			  			if(CoOvocal(frase[3],frase)!='V')
	      		  			  			return(true);
	      		                        else
	                                    return(false);
	      		  			  		}
	      		  			  		else
	                                return(false);
	      		  			  	 }
	      		  			  	 else
	                             return(false);
	      		  			   }
	      		  			   else
	                           return(false);
	      		  			}
	      		  			else
	                        return(false);
	      		  		 }
	      		  		 else
	                     return(false);

	      		  	}
	      		  	else
	                return(false);
	      		    }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      }
	      else
	      return(false);
	}
	else
    return(false);
}

static boolean V3Letras4(char frase[]){
	if(CoOvocal(frase[0],frase)=='V'&&CoOvocal(frase[1],frase)=='V'&&CoOvocal(frase[2],frase)=='V'){
	      if(Diptongo(frase[0], frase[1])==true){
	      	if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false){
	      		  		if(V4Letras1(frase)==false){
	      		  			if(V4Letras2(frase)==false){
	      		  			  if(V4Letras3(frase)==false){
	      		  			  	if(V4Letras4(frase)==false){
	      		  			  		if(V4Letras5(frase)==false){
	      		  			  			if(Diptongo(frase[1], frase[2])==true)
	      		  			  			return(true);
	      		                        else
	                                    return(false);
	      		  			  		}
	      		  			  		else
	                                return(false);
	      		  			  	 }
	      		  			  	 else
	                             return(false);
	      		  			   }
	      		  			   else
	                           return(false);
	      		  			}
	      		  			else
	                        return(false);
	      		  		 }
	      		  		 else
	                     return(false);

	      		  	}
	      		  	else
	                return(false);
	      		    }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      }
	      else
	      return(false);
	}
	else
    return(false);
}

static boolean V3Letras5(char frase[]){
	if(CoOvocal(frase[0],frase)=='V'&&CoOvocal(frase[1],frase)=='C'&&CoOvocal(frase[2],frase)=='V'){
	      if(Diptongo(frase[0], frase[2])==true){
	      	if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false){
	      		  		if(V4Letras1(frase)==false){
	      		  			if(V4Letras2(frase)==false){
	      		  			  if(V4Letras3(frase)==false){
	      		  			  	if(V4Letras4(frase)==false){
	      		  			  		if(V4Letras5(frase)==false){
	      		  			  		     if(frase[1]=='h')
	      		  			  				   return(true);
	      		                               else
	                                           return(false);

	      		  			  		   }
	      		  			  		   else
	                                   return(false);
	      		  			  	 }
	      		  			  	 else
	                             return(false);
	      		  			   }
	      		  			   else
	                           return(false);
	      		  			}
	      		  			else
	                        return(false);
	      		  		 }
	      		  		 else
	                     return(false);

	      		  	}
	      		  	else
	                return(false);
	      		    }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      }
	      else
	      return(false);
	}
	else
    return(false);
}

static boolean V3Letras6(char frase[]){
	if(CoOvocal(frase[0],frase)=='V'&&CoOvocal(frase[1],frase)=='V'&&CoOvocal(frase[2],frase)=='C'){
	      if(Diptongo(frase[0], frase[1])==true){
	      	if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false){
	      		  		if(V4Letras1(frase)==false){
	      		  			if(V4Letras2(frase)==false){
	      		  			  if(V4Letras3(frase)==false){
	      		  			  	if(V4Letras4(frase)==false){
	      		  			  		if(V4Letras5(frase)==false){
	      		  			  		     if(CoOvocal(frase[3],frase)!='V'){
	      		  			  		     	 if(Inseparables( frase[2],frase[3] )==false)
	      		  			  		     	 	return(true);
	      		                                else
	                                            return(false);
	      		  			  		     }
	      		  			  		    else
	                                    return(false);

	      		  			  		   }
	      		  			  		   else
	                                   return(false);
	      		  			  	 }
	      		  			  	 else
	                             return(false);
	      		  			   }
	      		  			   else
	                           return(false);
	      		  			}
	      		  			else
	                        return(false);
	      		  		 }
	      		  		 else
	                     return(false);

	      		  	}
	      		  	else
	                return(false);
	      		    }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      }
	      else
	      return(false);
	}
	else
    return(false);
}

static boolean V2Letras1(char frase[]){
	if(CoOvocal(frase[0],frase)=='C'&&CoOvocal(frase[1],frase)=='V'){/////////////////////////
	      if(Diptongo(frase[1],frase[2])==false){
	      	if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false){
	      		  		if(V4Letras1(frase)==false){
	      		  			if(V4Letras2(frase)==false){
	      		  			  if(V4Letras3(frase)==false){
	      		  			  	if(V4Letras4(frase)==false){
	      		  			  		if(V4Letras5(frase)==false){
	      		  			  			if(V3Letras1(frase)==false){
	      		  			  			  if(V3Letras2(frase)==false){
	      		  			  			  	if(V3Letras3(frase)==false){
	      		  			  			  		if(V3Letras4(frase)==false){
	      		  			  			  			if(V3Letras5(frase)==false){
	      		  			  			  				if(V3Letras6(frase)==false)
	      		  			  			  					return(true);
	      		                                            else
	                                                        return(false);
	      		  			  			  			}
	      		  			  			  			else
	                                                return(false);
	      		  			  			  		}
	      		  			  			  	     else
	                                             return(false);
	      		  			  			  	}
	      		  			  			  	else
	                                        return(false);
	      		  			  			  }
	      		  			  			  else
	                                      return(false);
	      		  			  			}

	      		                        else
	                                    return(false);
	      		  			  		}
	      		  			  		else
	                                return(false);
	      		  			  	 }
	      		  			  	 else
	                             return(false);
	      		  			   }
	      		  			   else
	                           return(false);
	      		  			}
	      		  			else
	                        return(false);
	      		  		 }
	      		  		 else
	                     return(false);

	      		  	}
	      		  	else
	                return(false);
	      		    }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      }
	      else
	      return(false);
	}
	else
    return(false);
}

static boolean V2Letras2(char frase[]){
	if(CoOvocal(frase[0],frase)=='V'&&CoOvocal(frase[1],frase)=='V'){
	      if(Diptongo(frase[0], frase[1])==true){
	      	if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false){
	      		  		if(V4Letras1(frase)==false){
	      		  			if(V4Letras2(frase)==false){
	      		  			  if(V4Letras3(frase)==false){
	      		  			  	if(V4Letras4(frase)==false){
	      		  			  		if(V4Letras5(frase)==false){
	      		  			  			if(V3Letras1(frase)==false){
	      		  			  			  if(V3Letras2(frase)==false){
	      		  			  			  	if(V3Letras3(frase)==false){
	      		  			  			  		if(V3Letras4(frase)==false){
	      		  			  			  			if(V3Letras5(frase)==false){
	      		  			  			  				if(V3Letras6(frase)==false)
	      		  			  			  					return(true);
	      		                                            else
	                                                        return(false);
	      		  			  			  			}
	      		  			  			  			else
	                                                return(false);
	      		  			  			  		}
	      		  			  			  		else
	                                            return(false);
	      		  			  			  	}
	      		  			  			  	else
	                                        return(false);
	      		  			  			  }
	      		  			  			  else
	                                      return(false);
	      		  			  			}

	      		                        else
	                                    return(false);
	      		  			  		}
	      		  			  		else
	                                return(false);
	      		  			  	 }
	      		  			  	 else
	                             return(false);
	      		  			   }
	      		  			   else
	                           return(false);
	      		  			}
	      		  			else
	                        return(false);
	      		  		 }
	      		  		 else
	                     return(false);

	      		  	}
	      		  	else
	                return(false);
	      		    }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      }
	      else
	      return(false);
	}
	else
    return(false);
}


static boolean V2Letras3(char frase[]){
	if(CoOvocal(frase[0],frase)=='V'&&CoOvocal(frase[1],frase)=='C'){
	      if(CoOvocal(frase[2],frase)!='V'){
	      	if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false){
	      		  		if(V4Letras1(frase)==false){
	      		  			if(V4Letras2(frase)==false){
	      		  			  if(V4Letras3(frase)==false){
	      		  			  	if(V4Letras4(frase)==false){
	      		  			  		if(V4Letras5(frase)==false){
	      		  			  			if(V3Letras1(frase)==false){
	      		  			  			  if(V3Letras2(frase)==false){
	      		  			  			  	if(V3Letras3(frase)==false){
	      		  			  			  		if(V3Letras4(frase)==false){
	      		  			  			  			if(Inseparables( frase[1],frase[2] )==false){
	      		  			  			  		          if(V3Letras5(frase)==false){
	      		  			  			  		          	 if(V3Letras6(frase)==false)
	      		  			  			  		          	 	return(true);
	      		                                                else
	                                                            return(false);
	      		  			  			  		          }
	      		                                          else
	                                                      return(false);
	      		  			  			  			}
	      		  			  			  			else
	                                                return(false);
	      		  			  			  		}
	      		                                else
	                                             return(false);
	      		  			  			  	}
	      		  			  			  	else
	                                        return(false);
	      		  			  			  }
	      		  			  			  else
	                                      return(false);
	      		  			  			}

	      		                        else
	                                    return(false);
	      		  			  		}
	      		  			  		else
	                                return(false);
	      		  			  	 }
	      		  			  	 else
	                             return(false);
	      		  			   }
	      		  			   else
	                           return(false);
	      		  			}
	      		  			else
	                        return(false);
	      		  		 }
	      		  		 else
	                     return(false);

	      		  	}
	      		  	else
	                return(false);
	      		    }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      }
	      else
	      return(false);
	}
	else
    return(false);
}
static boolean V1Letras(char frase[]){
	if(CoOvocal(frase[0],frase)=='V'){
	      if(Diptongo(frase[0], frase[1])==false){
	      	if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false){
	      		  		if(V4Letras1(frase)==false){
	      		  			if(V4Letras2(frase)==false){
	      		  			  if(V4Letras3(frase)==false){
	      		  			  	if(V4Letras4(frase)==false){
	      		  			  		if(V4Letras5(frase)==false){
	      		  			  			if(V3Letras1(frase)==false){
	      		  			  			  if(V3Letras2(frase)==false){
	      		  			  			  	if(V3Letras3(frase)==false){
	      		  			  			  		if(V3Letras4(frase)==false){
	      		  			  			  			if(V2Letras1(frase)==false){
	      		  			  			  				if(V2Letras2(frase)==false){
	      		  			  			  				   if(V2Letras3(frase)==false){
	      		  			  			  				   	   if(V3Letras5(frase)==false){
	      		  			  			  				   	   	   if(V3Letras6(frase)==false)
	      		  			  			  				   	   	   	 return(true);
	      		                                                     else
	                                                                 return(false);
	      		  			  			  				   	   }
	      		                                               else
	                                                           return(false);
	      		  			  			  				   }
	      		  			  			  				   else
	                                                       return(false);
	      		  			  			  				}
	      		                                        else
	                                                    return(false);
	      		  			  			  			}
	      		  			  			  			else
	                                                return(false);
	      		  			  			  		}

	      		                                else
	                                             return(false);
	      		  			  			  	}
	      		  			  			  	else
	                                        return(false);
	      		  			  			  }
	      		  			  			  else
	                                      return(false);
	      		  			  			}

	      		                        else
	                                    return(false);
	      		  			  		}
	      		  			  		else
	                                return(false);
	      		  			  	 }
	      		  			  	 else
	                             return(false);
	      		  			   }
	      		  			   else
	                           return(false);
	      		  			}
	      		  			else
	                        return(false);
	      		  		 }
	      		  		 else
	                     return(false);

	      		  	}
	      		  	else
	                return(false);
	      		    }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      }
	      else
	      return(false);
	}
	else
    return(false);
}

static boolean V1LetrasF(char frase[]){
	if(CoOvocal(frase[0],frase)!='V'){
	      if(CoOvocal(frase[1],frase)!='V'){
	      	if(V6Letras(frase)==false){
	      		  if(V5Letras1(frase)==false){
	      		  	if(V5Letras2(frase)==false){
	      		  		if(V4Letras1(frase)==false){
	      		  			if(V4Letras2(frase)==false){
	      		  			  if(V4Letras3(frase)==false){
	      		  			  	if(V4Letras4(frase)==false){
	      		  			  		if(V4Letras5(frase)==false){
	      		  			  			if(V3Letras1(frase)==false){
	      		  			  			  if(V3Letras2(frase)==false){
	      		  			  			  	if(V3Letras3(frase)==false){
	      		  			  			  		if(V3Letras4(frase)==false){
	      		  			  			  			if(V2Letras1(frase)==false){
	      		  			  			  				if(V2Letras2(frase)==false){
	      		  			  			  				   if(V2Letras3(frase)==false){
	      		  			  			  				   	   if(V3Letras5(frase)==false){
	      		  			  			  				   	   	   if(V3Letras6(frase)==false)
	      		  			  			  				   	   	   	 return(true);
	      		                                                     else
	                                                                 return(false);
	      		  			  			  				   	   }
	      		                                               else
	                                                           return(false);
	      		  			  			  				   }
	      		  			  			  				   else
	                                                       return(false);
	      		  			  			  				}
	      		                                        else
	                                                    return(false);
	      		  			  			  			}
	      		  			  			  			else
	                                                return(false);
	      		  			  			  		}

	      		                                else
	                                             return(false);
	      		  			  			  	}
	      		  			  			  	else
	                                        return(false);
	      		  			  			  }
	      		  			  			  else
	                                      return(false);
	      		  			  			}

	      		                        else
	                                    return(false);
	      		  			  		}
	      		  			  		else
	                                return(false);
	      		  			  	 }
	      		  			  	 else
	                             return(false);
	      		  			   }
	      		  			   else
	                           return(false);
	      		  			}
	      		  			else
	                        return(false);
	      		  		 }
	      		  		 else
	                     return(false);

	      		  	}
	      		  	else
	                return(false);
	      		    }
	      		  else
	              return(false);
	      		}
	      		else
	            return(false);
	      }
	      else
	      return(false);
	}
	else
    return(false);
}

static boolean EncontrarLetra(char[] frase){
	boolean encontre=false;
	for(int i=0;i<frase.length;i++){
	  if(CoOvocal(frase[i],frase)=='C'  || CoOvocal(frase[i],frase)=='V')
	   	encontre=true;
	   	}
	   	if(encontre==true)
	   	return(true);
	   	else
	   	return(false);
	}
 static String Silabas(String palabra ){
   char frase[]=new char[50];//////////////buscar palabra mas larga
   Arrays.fill(frase, ' ');
   StringBuffer recibe=new StringBuffer(palabra);
   String acuS="";
   llenarMatriz(frase, recibe);


   int i=0;
   while(EncontrarLetra(frase)==true){

  if(V6Letras(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,6);
  	acuS=acuS+"-";
  	recibe.delete(0,6);
  	Arrays.fill(frase, ' ');
  	llenarMatriz(frase, recibe);
  }

  if(V5Letras1(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,5);
  	acuS=acuS+"-";
  	recibe.delete(0,5);
  	Arrays.fill(frase, ' ');
  llenarMatriz(frase, recibe);
  }

  if(V5Letras2(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,5);
  	acuS=acuS+"-";
  	recibe.delete(0,5);
  	Arrays.fill(frase, ' ');
  	llenarMatriz(frase, recibe);
  }

  if(V4Letras1(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,4);
  	acuS=acuS+"-";
  	recibe.delete(0,4);
  	Arrays.fill(frase, ' ');
  	llenarMatriz(frase, recibe);
  }

  if(V4Letras2(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,4);
  	acuS=acuS+"-";
  	recibe.delete(0,4);
  	Arrays.fill(frase, ' ');
  	llenarMatriz(frase, recibe);
  }

  if(V4Letras3(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,4);
  	acuS=acuS+"-";
  	recibe.delete(0,4);
  	Arrays.fill(frase, ' ');
  	llenarMatriz(frase, recibe);
  }

  if(V4Letras4(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,4);
  	acuS=acuS+"-";
  	recibe.delete(0,4);
  	Arrays.fill(frase, ' ');
  	llenarMatriz(frase, recibe);
  }
   if(V4Letras5(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,4);
  	acuS=acuS+"-";
  	recibe.delete(0,4);
  	Arrays.fill(frase, ' ');
  	llenarMatriz(frase, recibe);
  }

  if(V3Letras1(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,3);
  	acuS=acuS+"-";
  	recibe.delete(0,3);
  	Arrays.fill(frase, ' ');
  	llenarMatriz(frase, recibe);
  }

  if(V3Letras2(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,3);
  	acuS=acuS+"-";
  	recibe.delete(0,3);
  	Arrays.fill(frase, ' ');
  llenarMatriz(frase, recibe);
  }

  if(V3Letras3(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,3);
  	acuS=acuS+"-";
  	recibe.delete(0,3);
  	Arrays.fill(frase, ' ');
  	llenarMatriz(frase, recibe);
  }

  if(V3Letras4(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,3);
  	acuS=acuS+"-";
  	recibe.delete(0,3);
  	Arrays.fill(frase, ' ');
  	llenarMatriz(frase, recibe);
  }

  if(V3Letras5(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,3);
  	acuS=acuS+"-";
  	recibe.delete(0,3);
  	Arrays.fill(frase, ' ');
  llenarMatriz(frase, recibe);
  }
if(V3Letras6(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,3);
  	acuS=acuS+"-";
  	recibe.delete(0,3);
  	Arrays.fill(frase, ' ');
  llenarMatriz(frase, recibe);
  }

  if(V2Letras1(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,2);
  	acuS=acuS+"-";
  	recibe.delete(0,2);
  	Arrays.fill(frase, ' ');
  	llenarMatriz(frase, recibe);
  }

  if(V2Letras2(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,2);
  	acuS=acuS+"-";
  	recibe.delete(0,2);
  	Arrays.fill(frase, ' ');
  	llenarMatriz(frase, recibe);
  }

  if(V2Letras3(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,2);
  	acuS=acuS+"-";
  	recibe.delete(0,2);
  	Arrays.fill(frase, ' ');
  	llenarMatriz(frase, recibe);
  }

  if(V1Letras(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+recibe.substring(0,1);
  	acuS=acuS+"-";
  	recibe.delete(0,1);
  	Arrays.fill(frase, ' ');
  llenarMatriz(frase, recibe);
  }
  if(V1LetrasF(frase)==true && EncontrarLetra(frase)==true){
  	acuS=acuS+"NO HAY SÍLABAS";
  	acuS=acuS+"-";
  	recibe.delete(0,2);
  	Arrays.fill(frase, ' ');
  llenarMatriz(frase, recibe);
  }


 }
  return(acuS);
}

static char[] llenarMatriz(char[] frase, StringBuffer recibe){

   for(int i=0;i<recibe.length();i++)
   	frase[i]=recibe.charAt(i);
   return(frase);
}



}
