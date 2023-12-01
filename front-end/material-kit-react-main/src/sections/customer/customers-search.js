import { useState } from 'react';
import MagnifyingGlassIcon from '@heroicons/react/24/solid/MagnifyingGlassIcon';
import { Card, InputAdornment, OutlinedInput, SvgIcon } from '@mui/material';

export const CustomersSearch = ({ onSearch }) => {
  const [searchQuery, setSearchQuery] = useState('');

  const handleSearch = () => {
    onSearch(searchQuery);
  };

  return (
    <Card sx={{p: 2}}>
      <OutlinedInput
        value={searchQuery}
        onChange={(e) => setSearchQuery(e.target.value)}
        fullWidth
        placeholder="Search product"
        startAdornment={(
          <InputAdornment position="start" onClick={handleSearch}>
            <SvgIcon color="action" fontSize="small">
              <MagnifyingGlassIcon/>
            </SvgIcon>
          </InputAdornment>
        )}
        sx={{maxWidth: 500}}
      />
    </Card>
  );
}