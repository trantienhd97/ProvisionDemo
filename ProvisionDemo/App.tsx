/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * Generated with the TypeScript template
 * https://github.com/react-native-community/react-native-template-typescript
 *
 * @format
 */

import React from 'react';
import {View, Text, StyleSheet, Pressable} from 'react-native';

declare const global: {HermesInternal: null | {}};

const App = () => {
  return (
    <>
      <View style={styles.container}>
        <View style={styles.header}>
          <Text style={styles.titleScreen}>Home</Text>
        </View>
        <View style={styles.contentView}>
          <Pressable style={styles.btnView}>
            <Text style={styles.titleBtn}>Thêm thiết bị</Text>
          </Pressable>
        </View>
      </View>
    </>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  header: {
    width: '100%',
    height: '10%',
    backgroundColor: 'blue',
    alignItems: 'center',
    justifyContent: 'center',
  },
  titleScreen: {
    fontSize: 18,
    fontWeight: 'bold',
    lineHeight: 22,
    color: 'white',
  },
  contentView: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  btnView: {
    paddingLeft: 16,
    paddingRight: 16,
    paddingBottom: 8,
    paddingTop: 8,
    backgroundColor: 'blue',
    borderRadius: 5,
  },
  titleBtn: {
    color: 'white',
    fontWeight: 'bold',
  },
});
export default App;
