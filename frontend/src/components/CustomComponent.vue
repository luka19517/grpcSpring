<template>
    <h2>{{ result }}</h2>
</template>
<script setup>
import { ref } from 'vue'
import axios from 'axios'

const result = ref();

async function testConnection() {

    const response = await axios({
        method: 'get',
        url: '/api/auth?username=lukadj&password=lukadj',
    })
    result.value = response.data
}

testConnection();

</script>