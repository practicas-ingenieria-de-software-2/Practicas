import React from 'react';
import { StyleSheet, Text, View, TouchableHighlight } from 'react-native';

function calcularGanador(tablero) {
  const matrizVictoria = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    [0, 4, 8],
    [2, 4, 6]
  ];

  for (let i = 0; i < matrizVictoria.length; i++) {
    const [a, b, c] = matrizVictoria[i];
    if (tablero[a] === tablero[b] && tablero[b] === tablero[c]) {
      return tablero[a];
    }
  }
  return null;
}

export default class App extends React.Component {
  constructor(props){
    super(props);
    this.state={
      actual:'O',
    }
    tablero = Array(9).fill('');
  }
  
  jugar(i){
    if (tablero[i] === ''){
      tablero[i] = this.state.actual;
    }
    if(this.state.actual === 'X'){
      this.setState({actual:'O'});
    }else if(this.state.actual === 'O'){
      this.setState({actual:'X'});
    }
  }
  

  render() {
    
    return (
      <View style={styles.container}>

        <Text style={styles.texto2}>TRIQUI </Text>

        <Text style={styles.texto2}>Juega {this.state.actual} </Text>

        <View style={styles.row}>
          <TouchableHighlight 
            onPress={()=>{if (tablero[0]===''){
              tablero[0]=this.state.actual;
            }
            if(this.state.actual==='X'){
              this.setState({actual:'O'});
            }else if(this.state.actual==='O'){
              this.setState({actual:'X'});
            }}} 
            underlayColor="white" style={styles.tochable}>
            <Text style={styles.texto}>{tablero[0]}</Text>
          </TouchableHighlight>    

          <TouchableHighlight 
            onPress={()=>{if (tablero[1]===''){
              tablero[1]=this.state.actual;
            }
            if(this.state.actual==='X'){
              this.setState({actual:'O'});
            }else if(this.state.actual==='O'){
              this.setState({actual:'X'});
            }}} 
            underlayColor="white" style={styles.tochable}>
            <Text style={styles.texto}>{tablero[1]}</Text>
          </TouchableHighlight>    

          <TouchableHighlight 
            onPress={()=>{if (tablero[2]===''){
              tablero[2]=this.state.actual;
            }
            if(this.state.actual==='X'){
              this.setState({actual:'O'});
            }else if(this.state.actual==='O'){
              this.setState({actual:'X'});
            }}} 
            underlayColor="white" style={styles.tochable}>
              <Text style={styles.texto}>{tablero[2]}</Text>
          </TouchableHighlight>    
        </View>

        <View style={styles.row}>
          <TouchableHighlight 
            onPress={()=>{if (tablero[3]===''){
              tablero[3]=this.state.actual;
            }
            if(this.state.actual==='X'){
              this.setState({actual:'O'});
            }else if(this.state.actual==='O'){
              this.setState({actual:'X'});
            }}} 
            underlayColor="white" style={styles.tochable}>
              <Text style={styles.texto}>{tablero[3]}</Text>
          </TouchableHighlight>    

          <TouchableHighlight 
            onPress={()=>{if (tablero[4]===''){
              tablero[4]=this.state.actual;
            }
            if(this.state.actual==='X'){
              this.setState({actual:'O'});
            }else if(this.state.actual==='O'){
              this.setState({actual:'X'});
            }}} 
            underlayColor="white" style={styles.tochable}>
              <Text style={styles.texto}>{tablero[4]}</Text>
            </TouchableHighlight>    

            <TouchableHighlight 
            onPress={()=>{if (tablero[5]===''){
              tablero[5]=this.state.actual;
            }
            if(this.state.actual==='X'){
              this.setState({actual:'O'});
            }else if(this.state.actual==='O'){
              this.setState({actual:'X'});
            }}} 
            underlayColor="white" style={styles.tochable}>
              <Text style={styles.texto}>{tablero[5]}</Text>
          </TouchableHighlight>    
        </View>

        <View style={styles.row}>
          <TouchableHighlight 
            onPress={()=>{if (tablero[6]===''){
              tablero[6]=this.state.actual;
            }
            if(this.state.actual==='X'){
              this.setState({actual:'O'});
            }else if(this.state.actual==='O'){
              this.setState({actual:'X'});
            }}} 
            underlayColor="white" style={styles.tochable}>
              <Text style={styles.texto}>{tablero[6]}</Text>
            </TouchableHighlight>    

            <TouchableHighlight 
              onPress={()=>{if (tablero[7]===''){
                tablero[7]=this.state.actual;
              }
              if(this.state.actual==='X'){
                this.setState({actual:'O'});
              }else if(this.state.actual==='O'){
                this.setState({actual:'X'});
              }}} 
              underlayColor="white" style={styles.tochable}>
              <Text style={styles.texto}>{tablero[7]}</Text>
            </TouchableHighlight>    

          <TouchableHighlight 
            onPress={()=>{if (tablero[8]===''){
              tablero[8]=this.state.actual;
            }
            if(this.state.actual==='X'){
              this.setState({actual:'O'});
            }else if(this.state.actual==='O'){
              this.setState({actual:'X'});
            }}} 
            underlayColor="white" style={styles.tochable}>
            <Text style={styles.texto}>{tablero[8]}</Text>
          </TouchableHighlight>    
        </View>
        
        <Text style={styles.texto2}>EL GANADOR ES ...  {calcularGanador(tablero)}</Text>

        <Text style={styles.texto3} onPress={()=>{
          this.setState({actual:'O'});
          for (let index = 0; index < tablero.length; index++) {
            tablero[index]='';
          }
          }}
        >REINICIAR
        </Text>

      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    height:'100%',
    width:'100%',
    flexDirection:'column',
    justifyContent:'center',
    alignItems:'center',
  },
  row:{
    flexDirection: 'row',
    height:100,
    width: '100%',
    justifyContent:'center',
    margin: 2
  },
  tochable:{
    height:'100%',
    width:100,
    borderColor: '#97D5E6',
    backgroundColor: '#7EB1BF',
    borderWidth:3,
    justifyContent:'center',
    alignItems:'center',
    borderRadius: 20,
    margin: 2
  },
  texto:{
    fontSize:100,
    color: 'white',
  },
  texto2:{
    fontSize:30,
    marginTop: 10,
    marginBottom: 10,
    color: '#97D5E6',
    fontWeight: "bold",
  },
  texto3:{
    fontSize:30,
    marginTop: 30,
    marginBottom: 10,
    color: 'white',
    fontWeight: "bold",
    backgroundColor: '#7EB1BF',
    padding: 5,
    borderRadius: 10
  }
});
