import { StatusBar } from 'expo-status-bar';
import { TextInput, FlatList, StyleSheet, Text, View } from 'react-native';
import { UseState } from 'react';

export default function App() {
let valorInicial =['florida','rio de janeiro' ,'nova york']

let [listaDestinos,definirListaDestinos] = UseState(valorInicial);
  return (
    <View style={styles.container}>
      <Text>Destinos</Text>
      <FlatList
       data={listaDestinos}
       renderItem={({item})=><Text>{item}</Text>}
      />
      <TextInput
      palceholder={'adicionar novo destino'}
      onSubmitEditing={
      ({nativeEvent})=>definirListaDestinos(listaDestinos.concat(nativeEvent.text))
      }
    />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
